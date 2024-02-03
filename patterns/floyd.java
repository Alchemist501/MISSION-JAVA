import java.util.Scanner;
public class floyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        int j,i=1,k=1;
        while (i<=r) {
            j=1;
            while (j<(i+1)) {
                System.out.print(" "+(k++));
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
