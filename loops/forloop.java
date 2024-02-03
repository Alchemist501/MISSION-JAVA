import java.util.*;
public class forloop {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = s.nextInt();
        System.out.print("Enter the string:");
        String sc= s.next();
        for(int i=9;i<n;i++)
            System.out.println(sc);
        s.close();
    }
}
/*Syntax of for loop
 * for(initialisation;condition;updation){
 *     statements;
 * }
 * if the condition statement is not included , then there will be no end to the program . it will be infinite
 */