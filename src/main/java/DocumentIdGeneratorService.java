import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentIdGeneratorService {

    private static final int CLIENT_ID_MAX_CHARACTERS = 13;
    private static final String SSA = "GK";
    private static final String DATE_FORMAT = "ddMMyyyyhhmmssSSS";


    public String generateDocumentId(String codAbi, long clientId, String documentType) {
        return new StringBuilder()
                .append(SSA)
                .append(createCurrentDate())
                .append(codAbi)
                .append(fixClientIdToContainMaxCharacters(clientId))
                .append(documentType).toString();
    }

    private String fixClientIdToContainMaxCharacters(long clientId) {
        String original = Long.toString(clientId);

        if (original.length() == CLIENT_ID_MAX_CHARACTERS) {
            return original;
        }
        return original.length() > CLIENT_ID_MAX_CHARACTERS ? stripLeadingCharacters(original) : addLeadingZeros(original);
    }

    private String stripLeadingCharacters(String original) {
        return StringUtils.right(original, CLIENT_ID_MAX_CHARACTERS);
    }

    private String addLeadingZeros(String clientId) {
        return StringUtils.leftPad(clientId, CLIENT_ID_MAX_CHARACTERS, "0");
    }

    private String createCurrentDate() {
        String dateWithMillis = new SimpleDateFormat(DATE_FORMAT).format(new Date());
        return cutLastMilliSecondto41DigitFormat(dateWithMillis);
    }

    private String cutLastMilliSecondto41DigitFormat(String dateWithMillis) {
        return dateWithMillis.substring(0, dateWithMillis.length() - 1);
    }
}
