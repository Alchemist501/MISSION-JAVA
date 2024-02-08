import java.util.Scanner;
class Example1{
    public static void PrintMyName(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name : ");
    String name = sc.next();
    System.out.println("The name you entered is : "+name);
    sc.close();
    return ; 
    }
    public static void main(String args[]){
        PrintMyName();//Calling the function
    }
}