import java.util.*;
public class evennumbers {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the limit : ");
            int i, n = s.nextInt();
            for(i=2;i<=n;i+=2)
                System.out.println(i);
        }
    }
}
