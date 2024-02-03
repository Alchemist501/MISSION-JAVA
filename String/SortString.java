import java.util.*;
import java.util.StringTokenizer;
import java.io.*;
public class SortString {
    public static void main(String[] args) {
        String outputfile = args[0];
        try{
            String input = readLineFromUser();
            StringTokenizer str = new StringTokenizer(input);
            List<String> words = new ArrayList<>();
            while(str.hasMoreTokens())
                words.add(str.nextToken());
            Collections.sort(words);
            writeSortedWordsToFile(words,outputfile);
            System.out.println("THEY ARAE ;"+ words.size());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    private static String readLineFromUser()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of words : ");
        return reader.readLine();
    }
    private static void writeSortedWordsToFile(List<String>words, String outputfile)throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputfile))) {
            // Write each sorted word to the file
            for (String word : words) {
                writer.write(word);
                writer.newLine();
            }
        }
        System.out.println("Sorted words have been written to " + outputfile);
    }
}
