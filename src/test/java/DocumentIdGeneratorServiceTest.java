import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("document generator service")
public class DocumentIdGeneratorServiceTest {

    private DocumentIdGeneratorService idGeneratorService = new DocumentIdGeneratorService();
    private static final String DOCUMENT_TYPE = "GPERS";
    private static final String COD_ABI = "80023";
    private static final int BUSINESS_SPECIFIC_SIZE = 41;
    private static final String MUST_NOD_ADD_ZEROS_WHEN_CLIENT_ID_LONGER_THAN_13_DIGITS = "000";
    private static final String MUST_ADD_10_ZEROS_TO_3_DIGIT_CLIENT_ID = "0000000000";
    private static final String MUST_NOT_ADD_ZEROS = "000";
    private static final String CURRENT_YEAR = createCurrentYear();
    private static final String CURRENT_MONTH = createCurrentMonth();
    private static final String CURRENT_DAY = createCurrentDay();
    private static final String SSA = "GK";
    private static final String DATE_FORMAT = "ddMMyyyyhhmmss";
    private static final String CURRENT_DATE = createCurrentDate();
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();

    @Test
    @DisplayName("client ID shorter than 13 digits")
    public void clientIdShorterThan13digits() {
        String documentId = idGeneratorService.generateDocumentId(COD_ABI, 123, DOCUMENT_TYPE);
        assertThat(documentId).isNotBlank();
        assertThat(documentId).startsWith(SSA).endsWith(DOCUMENT_TYPE);
        assertThat(documentId)
                .containsOnlyOnce(CURRENT_YEAR)
                .containsOnlyOnce(CURRENT_MONTH)
                .containsOnlyOnce(CURRENT_DAY);
        assertThat(documentId).containsSubsequence(MUST_ADD_10_ZEROS_TO_3_DIGIT_CLIENT_ID);
        assertThat(documentId).hasSize(BUSINESS_SPECIFIC_SIZE);
        assertThat(documentId).containsOnlyOnce(CURRENT_DATE);
        System.out.println(documentId);
    }

    @Test
    @DisplayName("client ID longer than 13 digits")
    public void clientIdLongerThan13digits() {
        String documentId = idGeneratorService.generateDocumentId(COD_ABI, 12345678888889999L, DOCUMENT_TYPE);
        assertThat(documentId).isNotBlank();
        assertThat(documentId)
                .startsWith(SSA)
                .endsWith(DOCUMENT_TYPE);
        assertThat(documentId)
                .containsOnlyOnce(CURRENT_YEAR)
                .containsOnlyOnce(CURRENT_MONTH)
                .containsOnlyOnce(CURRENT_DAY);
        assertThat(documentId).containsOnlyOnce(CURRENT_YEAR);
        assertThat(documentId).doesNotContain(MUST_NOD_ADD_ZEROS_WHEN_CLIENT_ID_LONGER_THAN_13_DIGITS);
        assertThat(documentId).hasSize(BUSINESS_SPECIFIC_SIZE);
        assertThat(documentId).containsOnlyOnce(CURRENT_DATE);
        System.out.println(documentId);
    }

    @Test
    @DisplayName("client ID with exactly 13 digits")
    public void clientIdEqual13digits() {
        String documentId = idGeneratorService.generateDocumentId(COD_ABI, 12345678910111213L, DOCUMENT_TYPE);
        assertThat(documentId).isNotBlank();
        assertThat(documentId)
                .startsWith(SSA)
                .endsWith(DOCUMENT_TYPE);
        assertThat(documentId)
                .containsOnlyOnce(CURRENT_YEAR)
                .containsOnlyOnce(CURRENT_MONTH)
                .containsOnlyOnce(CURRENT_DAY);
        assertThat(documentId).doesNotContain(MUST_NOT_ADD_ZEROS);
        assertThat(documentId).hasSize(BUSINESS_SPECIFIC_SIZE);
        assertThat(documentId).containsOnlyOnce(CURRENT_DATE);
        System.out.println(documentId);
    }

    private static String createCurrentDate() {
        return new SimpleDateFormat(DATE_FORMAT).format(new Date());
    }

    private static String createCurrentYear() {
        Calendar calendar = getCalendar();
        return String.valueOf(calendar.get(Calendar.YEAR));
    }

    private static String createCurrentMonth() {
        Calendar calendar = getCalendar();
        return String.valueOf(calendar.get(Calendar.YEAR));
    }

    private static String createCurrentDay() {
        Calendar calendar = getCalendar();
        return String.valueOf(calendar.get(Calendar.YEAR));
    }

    private static Calendar getCalendar() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
}