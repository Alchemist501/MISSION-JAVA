import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        int sum=0;
        int i=0;
        do {
            sum+=i;
            i++;
        } while (i<n);
        System.out.println("The sum of "+n+" natural numbers is : "+sum);
        sc.close();
    }
}
