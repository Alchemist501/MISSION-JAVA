import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.StringTokenizer;  
import java.io.*;
class Stringue{  
 public static void main(String args[]){  
    String output = args[0];
   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }
     try{
     FileWriter fileWriter = new FileWriter(output);
     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
     bufferedWriter.close();}
     catch(IOException e){
        e.printStackTrace();
     }
   }  
}  