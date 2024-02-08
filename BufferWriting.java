import java.io.*;

public class BufferWriting {
    public static void main(String args[]) {
        String text = "Enter the details ";
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i] + " ");
        }
        System.out.println(sb);
        File file = new File("newFile.txt");
        try {
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(sb.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
