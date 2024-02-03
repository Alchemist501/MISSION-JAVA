import java.util.*;
class Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        String name= sc.next();         //Input string
        System.out.println(name);
        int n=sc.nextInt(); //Input integer 
        System.out.println(n);
        float h= sc.nextFloat(); //Input float 
        System.out.println(h);
        sc.close();  //sc is closed here . othervise error occurs
    }
}
/**
    n,h and name are the variables . They can be changed at any part of the program.
    println==> The next output will come in next line .
    java.util is the package which contains the scanner class.
    new keyword is used to allocate memory .
 */