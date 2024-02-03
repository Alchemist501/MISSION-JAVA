import java.util.Scanner;
public class frequency {
    static void Freq(String str , char ch){
        int flag =0;
        for(int i =0;i<str.length();i++){
            if (ch == str.charAt(i)) 
               flag ++; 
        }
        System.out.println("The frequency of "+ch+" is "+ flag);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);
        Freq(str,ch);
        sc.close();
    }
}
