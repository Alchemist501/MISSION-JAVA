import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter outputFile = new FileWriter("output.txt");
            File inputFile = new File("output.txt");
            outputFile.write("Hello java!!!!");
            outputFile.close();
            FileReader file = new FileReader("output.txt");
            System.out.println("Name of File is : " + inputFile.getName() + "\nIs the File Readable : "
                    + inputFile.canRead() + "\nIs the file editable : " + inputFile.canWrite()
                    + "\nIs the file executable : " + inputFile.canExecute() + "\nAbsolute Path : "
                    + inputFile.getAbsolutePath() + "\nSize of File : " + inputFile.length());
            int character;
            StringBuilder fileContent = new StringBuilder();
            while ((character = file.read()) != -1) {
                fileContent.append((char) character);
            }
            System.out.println("File content: " + fileContent);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
