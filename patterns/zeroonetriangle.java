import java.util.Scanner;
public class zeroonetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        int j,i=1;
        if (r<0) 
            System.out.println("invalid number");
        else if(r==0)
            System.out.println();
        else{
            do{
                j=1;
                do{
                    if ((i+j)%2==0) 
                        System.out.print(" "+1);
                    else
                        System.out.print(" "+0);
                    j++;
                }while (j<(i+1));
                System.out.println();
                i++;
            }while (i<=r);
        }
        sc.close();
    }
}
