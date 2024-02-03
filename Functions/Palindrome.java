import java.util.*;
public class Palindrome {
    static void palindrome(String str){
        int flag =0;
        for(int i =0;i<=(str.length()/2);i++){
            if(str.charAt(i)!=(str.charAt(str.length()-i-1))){
                flag++;
                break;
            }
        }
        if(flag==0)
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check : ");
        String str = sc.next();
        palindrome(str);
        sc.close();
    }
}
