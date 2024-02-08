import java.io.*;
public class CopyingFiles{
    public static void main(String args[]){
    try{
        String line;
        String f1 = args[0];
        String f2 = args[1];
        BufferedReader br = new BufferedReader(new FileReader(f1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
        while((line=br.readLine())!=null){
            bw.write(line+" ");
        }
        br.close();
        bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
