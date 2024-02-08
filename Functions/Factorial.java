import java.util.Scanner;
public class Factorial {
    public static int Fact(int a){
        int fact =1;
        for(int i =1;i<=a;i++)
            fact = fact*i;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("The factorial is : "+Fact(n1));
        sc.close();
    }
}
