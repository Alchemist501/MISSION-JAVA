import java.io.File;//To handle input output operations in Files
import java.io.IOException; //To handle the exceptions

public class CreateFile {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            if (inputFile.createNewFile())
                System.out.println("File created : " + inputFile.getName());
            else
                System.out.println("File already exists");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
