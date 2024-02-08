import java.io.*;

class BufferReading {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Input.txt")); // File name
            String File;
            while ((File = br.readLine()) != null) {
                System.out.println(File);
            }
            ; // Read each and every line on the file
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}