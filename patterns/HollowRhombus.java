import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, i = 0;
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();
        if (num <= 0)
            System.out.println("invalid number of rows");
        else {
            do {
                j = 0;
                while (j < num - i - 1) {
                    System.out.print("   ");
                    j++;
                }
                j = num - i - 1;
                do {
                    if (j == num - i - 1 || j == (2 * num) - i - 2 || i == 0 || i == num - 1)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                    j++;
                } while (j < (2 * num) - i - 1);
                System.out.println();
                i++;
            } while (i < num);
        }
        sc.close();
    }
}
