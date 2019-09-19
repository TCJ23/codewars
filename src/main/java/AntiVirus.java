import java.util.Arrays;

public class AntiVirus {

//    private int scanIntensity = 0;
//
//    public void setScanIntensity(int level) {
//        scanIntensity = level;
//    }
//
//    public String scanFile(File file, VirusDB database) {
//        String data = file.getData().toLowerCase();
//
//        for (int i = 1; i < scanIntensity; i++) {
//
//            String[] signatures = database.getSignatures(i);
//
//            for (int u = 0; u < signatures.length; u++) {
//
//                if (data.contains(signatures[u].toLowerCase()))
//                    return file.getName() + " is not safe";
//            }
//        }
//        return file.getName() + " is safe";
//    }

    private int scanIntensity = 0;

    //this method is ready for you.
    public void setScanIntensity(int level) {
        scanIntensity = level;
    }

    //write this method.
    public String scanFile(File file, VirusDB database) {

        String data = file.getData();
        String fileName = file.getName();

        for (int i = 1; i <= scanIntensity; i++) {
            if (Arrays.stream(database.getSignatures(i))
                    .anyMatch(s -> data.toLowerCase().contains(s.toLowerCase()))) {
                return fileName + " is not safe";
            }
        }
        return fileName + " is safe";
    }
}


   /* private int scanIntensity = 0;

    //this method is ready for you.
    public void setScanIntensity(int level) {
        scanIntensity = level;
    }

    //write this method.
    public String scanFile(File file, VirusDB database) {
        String[] signatures = database.getSignatures(scanIntensity);

        Set<String> allPossibleWords = permutations(file.getData());

        if (checkIfInVirusDBsignature(allPossibleWords, signatures)) {

            return file.getName() + " is safe";
        } else {
        return file.getName() + " is not safe";
        }
    }

    private static boolean checkIfInVirusDBsignature(Set<String> allPossibleWords, String[] signatures) {
        Set<String> signs = new HashSet<>(Arrays.asList(signatures));
        boolean foundVirus = false;
        for (String signature : signatures) {
            allPossibleWords.contains(signature);
            foundVirus = true;
        }
        return foundVirus;
    }

    private static Set<String> permutations(String str) {
        Set<String> result = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            result.add("");
            return result;
        }

        char firstChar = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutations(rem);

        for (String newString : words) {
            for (int i = 0; i <= newString.length(); i++) {
                result.add(charAdd(newString, firstChar, i));
            }
        }
        return result;
    }

    private static String charAdd(String str, char c, int j) {
        String first = str.substring(0, j);
        String last = str.substring(j);
        return first + c + last;
    }

    public static void main(String[] args) {
        System.out.println("\nString " + "q4khFPhsPyWareRbxFZefTpN74cRr8Rh9b18Gtvbyz3" + ":\nPermutations: "
                + permutations("q4khFPhsPyWareRbxFZefTpN74cRr8Rh9b18Gtvbyz3"));
    }
}
*/


/*EXAMPLES
String[] intensity1signatures = new String[]{
        "malware",
        "virus",
        "infect"
      };

      String[] intensity2signatures = new String[]{
        "ransomware",
        "trojan",
        "trojanHorse",
        "worm",
        "spyware",
        "keystrokelogger",
        "adware",
        "botnet",
        "rootkit",
      };

      String[] intensity3signatures = new String[]{
        "DeleteSys32",
        "OverideMBR",
        "EncryptAll",
        "openrandomwebsite",
        "openrandwebsite",
        "sendalldata",
        "recordKeyboard",
        "recordmouse",
        "destroy",
        "overheat",
        "getfullcontrol",
        "uploadharddrive",
        "uploadharddisk",
        "overload",
        "changeOS",
        "encrypt",
        "changeDesktop",
        "ddos",
        "dos",
        "hide",
        "inject",
        "ransom",
        "getcreditcardinfo",
        "getpasswords",
        "getpass",
      };*/