import java.util.Scanner;
import java.util.StringTokenizer;

public class AddTokens {
    public static void main(String args[]) {

        int num;
        String token;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers with space between them :");
        String numbers = sc.nextLine();
        StringTokenizer st = new StringTokenizer(numbers);
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            System.out.println(token);
            num = Integer.parseInt(token);
            sum += num;
        }
        System.out.println("The sum of numbers entered is " + sum);
        sc.close();

    }
}
