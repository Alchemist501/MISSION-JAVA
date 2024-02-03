import java.util.Scanner;
public class Multiply {
    public static int Product(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.println("The product is "+ Product(n1,n2));
        sc.close();
    }
}
