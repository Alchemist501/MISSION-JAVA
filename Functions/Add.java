import java.util.Scanner;
public class Add {
    public static int Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        sc.close();
        return n1 + n2 ;
    }
    public static void main(String[] args) {
        System.out.println("The sum is : "+Sum());
    }
}
