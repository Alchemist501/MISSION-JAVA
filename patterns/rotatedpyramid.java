import java.util.*;
public class rotatedpyramid {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        i=1;
        while (i<=r) {
            j=0;
            while (j<=(r-i)) {
                System.out.print("   ");
                j++;
            }
            j=r-i;
            while (j<r) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
