import java.util.Scanner;
public class rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        //Outer loop
        for(int i=0;i<r;i++){
            //Inner loop
            for(int j=0;j<c;j++)//nested loops
                System.out.print("*  ");
            System.out.print("\n");
        }
        sc.close();
    }
}
//nested loop: one loop nested inside another