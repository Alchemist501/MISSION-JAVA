import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        try (Scanner sc = new Scanner(System.in)) {
            int i,count=0,n = sc.nextInt();
            if(n<=1)
                System.out.println(n+" is not a prime number ");
            else {
                for(i=2;i<(n/2);i++){
                    if (n%i==0){
                        count++;
                        break;
                    }
                }
                if (count==0) 
                    System.out.println(n+" is a prime number ");
                else
                    System.out.println(n+" is not a prime number ");
            }
        }
    }
}
