import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCryptoTest {
    @Test
    public void encodeBasicTest() {
        assertEquals("Hw wx, Euxwh?", CaesarCrypto.encode("Et tu, Brute?", 3));
    }

    @Test
    public void encodeBasicInverselyTest() {
        assertEquals("Et tu, Brute?", CaesarCrypto.encode("Hw wx, Euxwh?", -3));
    }
}