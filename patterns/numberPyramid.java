import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int i = 1, j, k;
        do {
            k = 1;
            while (n - i >= k) {
                System.err.print(" ");
                k++;
            }
            j = 1;
            do {
                System.out.print(i + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (n >= i);
        sc.close();
    }
}
