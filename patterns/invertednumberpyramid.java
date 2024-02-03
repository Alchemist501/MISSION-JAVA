import java.util.Scanner;
public class invertednumberpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        int i=0,j;
        while (i<r) {
            j=1;
            while (j<=(r-i)) 
                System.out.print(" "+(j++));
            System.out.println();
            i++;
        }
        sc.close();
    }
}
