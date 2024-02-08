import java.util.StringTokenizer;
import java.io.*;

public class Tokenizer {
    public static void main(String args[]) {
        int i = 1;
        String text = args[0];
        File newFile = new File("Readtext.txt");
        try {
            newFile.createNewFile();
            StringBuilder sb = new StringBuilder(text);
            BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
            while (i < args.length) {
                bw.write(args[i] + " ");
                sb.append(args[i] + " ");
                i++;
            }
            StringTokenizer st = new StringTokenizer(sb.toString());
            while (st.hasMoreTokens()) {
                String Token = st.nextToken();
                System.out.println(Token);
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
