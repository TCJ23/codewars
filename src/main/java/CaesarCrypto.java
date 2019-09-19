public class CaesarCrypto {


    public static String encode(String plainText, int shift) {
        String shifted = "";
        for(int i = 0; i < plainText.length(); i++) {
            char original = plainText.charAt(i);
            char shiftedChar = (char) ((original + shift) % Integer.MAX_VALUE);
            shifted += shiftedChar; // Append shifted character to the end of the string
        }

        return shifted;
    }
}
