import java.util.Scanner;

class Arrays2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        // Array Declaration
        int[][] twoDArray = new int[r][c];
        // Input elements
        System.out.println("Enter the elements ");
        int i, j;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                twoDArray[i][j] = sc.nextInt();
        }
        // Display elements
        System.err.println("Display the elements");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                System.err.print(twoDArray[i][j] + " ");
            System.err.println();
        }
        sc.close();
    }
}
/*
 * Declaration
 * type[][]arrayName = new type[rows][cols];
 * total memory used = row*cols*(sizeof)type
 */