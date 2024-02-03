import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the radius:");
        int r=sc.nextInt();
        System.out.println("The area of the circle is :"+r*3.14*r+"\nThe perimeter of the circle is :"+2*3.14*r);
        sc.close();
    }
}
