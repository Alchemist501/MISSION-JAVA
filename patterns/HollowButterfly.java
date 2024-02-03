import java.util.Scanner;

class HollowButterfly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int i, j, k, l = 0;
        for (i = n - 1; i >= 0; i--) {
            j = 0;
            do {
                if (j == 0 || j == n - i - 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
                j++;
            } while (j < n - i);
            for (k = 0; k < ((2 * n) - (2 * j)); k++) {
                System.out.print("   ");
            }
            for (l = j + k; l < (2 * n); l++) {
                if (l == j + k || l == (2 * n) - 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        for (i = 0; i <= n - 1; i++) {
            j = 0;
            do {
                if (j == 0 || j == n - i - 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
                j++;
            } while (j < n - i);
            for (k = 0; k < ((2 * n) - (2 * j)); k++) {
                System.out.print("   ");
            }
            for (l = j + k; l < (2 * n); l++) {
                if (l == j + k || l == (2 * n) - 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        sc.close();
    }
}