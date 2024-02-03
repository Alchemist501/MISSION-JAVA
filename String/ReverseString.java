import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.err.println("The string you entered is " + str);
        for (int i = sb.length() - 2; i >= 0; i--) {
            sb.append(str.charAt(i));
            sb.deleteCharAt(0);
        }
        System.out.println("Reversed string is : " + sb);
        sc.close();
    }
}
