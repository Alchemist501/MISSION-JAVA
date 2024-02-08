import java.io.File;
import java.io.IOException;

public class FileInfo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("sarikama.txt");
            if (inputFile.exists()) {
                System.out.println("Name of File is : " + inputFile.getName() + "\nIs the File Readable : "
                        + inputFile.canRead() + "\nIs the file editable : " + inputFile.canWrite()
                        + "\nIs the file executable : " + inputFile.canExecute() + "\nAbsolute Path : "
                        + inputFile.getAbsolutePath() + "\nSize of File : " + inputFile.length());
            } else if (inputFile.createNewFile()) {
                System.out.println("Name of File is : " + inputFile.getName() + "\nIs the File Readable : "
                        + inputFile.canRead() + "\nIs the file editable : " + inputFile.canWrite()
                        + "\nIs the file executable : " + inputFile.canExecute() + "\nAbsolute Path : "
                        + inputFile.getAbsolutePath() + "\nSize of File : " + inputFile.length());
            } else
                System.out.println("The file doesn't exists");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
