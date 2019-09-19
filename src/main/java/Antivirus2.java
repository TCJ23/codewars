public class Antivirus2{

    private int scanIntensity = 0;

    public void setScanIntensity(int level){
        scanIntensity = level;
    }

    public String scanFile(File file,VirusDB database){
        String data = file.getData().toLowerCase();

        for(int i = 1; i <= scanIntensity; i++) {

            String [] signatures = database.getSignatures(i);

            for(int u = 0; u < signatures.length; u++) {

                if(data.contains(signatures[u].toLowerCase()))
                    return file.getName() + " is not safe";

            }

        }
        return file.getName() + " is safe";
    }
}