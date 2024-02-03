import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to check whether it is even or odd :");
        int n= sc.nextInt();
        if (n%2==0) 
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");        
        sc.close();
    }
}
/**
 * Syntax for if statement 
 * if (condition){
 *     statements;
 * }else if(condition){
 *     statements;
 * }else{
 *     statements;
 * }  
 */