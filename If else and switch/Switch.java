import java.util.*;
public class Switch {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("N = 1");
                break; 
            default:
                System.out.println("Invalid ");
                break;
        }
        sc.close();
    }
}
// switch (variable) {
//     case value:
//         statements
//         break; 
//     default:
//         statements
//         break;
//         }
//when the case value == var , then the break statement will break the program flow and exit the current the loop 
// If the break statement is not present , then all the statements after the matching case will be executed