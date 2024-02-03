import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i=1;
        while (i<=10) 
            System.err.println(i+" * "+n+" = "+(i++*n));
        sc.close();
    }
}
