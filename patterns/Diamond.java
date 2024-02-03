import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int i, j, k;
        for (i = 0; i < n; i++) {
            j = 0;
            while (j < n - i) {
                System.err.print("  ");
                j++;
            }
            k = 0;
            while (k < (2 * i) + 1) {
                System.err.print("* ");
                k++;
            }
            System.err.println();
        }
        for (i = n - 1; i >= 0; i--) {
            j = 0;
            while (j < n - i) {
                System.err.print("  ");
                j++;
            }
            k = 0;
            while (k < (2 * i) + 1) {
                System.err.print("* ");
                k++;
            }
            System.err.println();
        }
        sc.close();
    }
}
