import java.util.Scanner;
public class naturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        System.out.println("Natural numbers are ......");
        for(int i=0;i<n;i++)
            System.out.println(i+1);
        sc.close();
    }
}
