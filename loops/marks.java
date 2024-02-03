import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark , n=1;
        do{
            switch (n) {
                case 1:{
                    System.err.print("Enter the mark : ");
                    mark=sc.nextInt();
                    if (mark>=90) 
                        System.out.println(mark+" is good");
                    else if(mark>59&&mark<=89)
                        System.out.println(mark+" is also good");
                    else
                        System.out.println(mark+" is also good as well");
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Enter 1 to continue and 0 to stop");
            n = sc.nextInt();
        }while(n==1);
        sc.close();
    }
}
