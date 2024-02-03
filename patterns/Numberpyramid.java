import java.util.Scanner;

public class Numberpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        int j,i=1;
        do {
            j=0;
            while (j<=r-i-1) {
                System.out.print("   ");
                j++;
            }
            j=1;
            do {
                System.out.print(" "+i+" ");
                j++;
            } while (j<=(2*i-1));
            System.out.println();
            i++;
        } while (i<=r);
        sc.close();
    }
}
