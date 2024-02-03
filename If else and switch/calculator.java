import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number 1 :");
        int a = SC.nextInt();
        System.out.print("Enter the number 2 :");
        int b = SC.nextInt();
        System.out.println("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nENter 4 for division\nEnter 5 for finding the remainder :");
        int n = SC.nextInt();
        switch (n) {
            case 1:
                System.out.println("The sum is "+(a+b));
                break;
            case 2:
                System.out.println("The difference is "+(a-b));
                break;
            case 3:
                System.out.println("The product is "+(a*b));
                break;
            case 4:
                System.out.println("The quotient is "+(a/b));
                break;
            case 5:
                System.out.println("The remainder is "+(a%b));
                break;
            default:
                System.out.println("Invalid number entered");
                break;
        }
        SC.close();
    }
}
