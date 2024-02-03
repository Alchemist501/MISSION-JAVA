import java.util.Scanner;
public class MatrixMultiplication {
    static int i,j;
    static Scanner sc = new Scanner(System.in);
    static void multiplication(int rows,int col, int m1[][],int m2[][],int result [][]){
        System.out.println("The resultant matrix is : ");
        for(i=0;i<rows;i++){
            for(j=0;j<col;j++){
                for(int k=0;k<rows;k++)
                   result[i][j]+=m1[i][k]*m2[k][j];
            }
        }
    }
    static void Enter(int rows,int cols,int m1[][]){
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.print("Enter the element of matrix["+i+"]["+j+"] : ");
                m1[i][j]=sc.nextInt();
            }
        }
    }
    static void display(int rows,int cols,int m1[][]){
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++)
               System.out.print(m1[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of rows of matrix 1 : ");
        int row1 = sc.nextInt();
        System.out.print("Enter the number of columns of matrix 1 : ");
        int col1 =sc.nextInt();
        int [][] m1=new int[row1][col1];
        System.out.print("Enter the number of rows of matrix 2 : ");
        int row2 = sc.nextInt();
        System.out.print("Enter the number of columns of matrix 2 : ");
        int col2 =sc.nextInt();
        int [][] m2=new int[row1][col1];
        if(col1==row2){
            int [][] result= new int[row1][col2];
            System.out.println("Enter the elements of matrix 1 ");
            Enter(row1,col1,m1);
            System.out.println("Enter the elements of matrix 2 ");
            Enter(row2,col2,m2);
            multiplication(row1, col2,m1,m2,result);
            display(row1,col2,result);
        }else
            System.out.println("Not possible ");
    }
}
