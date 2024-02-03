import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = s.nextInt();
        System.out.print("Enter the string:");
        String sc= s.next();
        int i=0;
        while (i<n) {
            System.err.println(sc);
            i++;
        }
        s.close();
    }
}
/*
 * Syntax of while loop 
 * initialisation;
 * while(condition){
 *     statements;
 *     updation;
 * }
 */