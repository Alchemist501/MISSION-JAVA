import java.util.Scanner;

public class solidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                System.err.print("  ");
            }
            j = 0;
            do {
                System.err.print("* ");
                j++;
            } while (j < n);
            System.err.println();
        }
        sc.close();
    }
}
