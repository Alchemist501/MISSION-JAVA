import java.util.Scanner;

public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int i = 1, j, k;
        do {
            j = i;
            k = 1;
            while (k < (2 * n - 2 * i) + 1) {
                System.err.print(" ");
                k++;
            }
            while (j > 1) {
                System.err.print(j + " ");
                j--;
            }
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= n);
        sc.close();
    }
}
