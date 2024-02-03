import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = s.nextInt();
        System.out.print("Enter the string:");
        String sc= s.next();
        int i=0;
        do{
            System.out.println(sc);
            i++;
        }while(i<n);
        s.close();
    }
}
/*
 * Syntax of dowhile loop
 * initialization;
 * do{
 * statements;
 * updation;
 * }while(condition);
 * in dowhile loop the statements are executed atleast one time whether the condition is true or not
 * the semicolon is required after while statement because the loop is ending there. 
 */