import java.util.Scanner;
public class Invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        for(int i =r-1;i>=0;i--){
            for(int j = i ;j>=0;j--)                  
                System.out.print(" * ");
            System.out.println();
        }
        sc.close();
    }
}
