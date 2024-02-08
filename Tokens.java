/*Read a String("Model Engineering College") using a TextField. When a "Read" button is clicked, tokenize the string in TextField with space as delimiter and write  it into a file in following format:
================
Sl No.  Token
================
111.     Model
112.     Engineering 
113.     College
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class Tokens {
    public static void main(String[] args) {
        try {
            int i = 1;
            int num = 111;
            String token;
            String textField = args[0];
            StringBuilder sb = new StringBuilder(textField);
            BufferedWriter bw = new BufferedWriter(new FileWriter("Input.txt"));
            bw.write("================\nSl No.  Token\n================");
            while (i < args.length) {
                sb.append(" " + args[i++]);
            }
            StringTokenizer st = new StringTokenizer(sb.toString());
            while (st.hasMoreTokens()) {
                token = st.nextToken();
                bw.write("\n" + num + ".     " + token);
                num++;
            }
            bw.close();
        } catch (Exception e) {
        }
    }
}
