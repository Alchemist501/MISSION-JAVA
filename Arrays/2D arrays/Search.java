import java.util.Scanner;

public class Search {
    static int i;

    static int Searchelement(int x, int array[]) {
        System.out.println(array.length);
        for (i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        int[][] numbers = new int[r][c];
        System.out.println("Enter the elements ");
        int i, j, flag = 0;
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++)
                numbers[i][j] = sc.nextInt();
        }
        System.err.print("Enter the element to be searched for: ");
        int x = sc.nextInt();
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (x == numbers[i][j]) {
                    System.err.println(x + " is found at position (" + (i + 1) + "," + (j + 1) + ")");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            System.err.println("The element doesn't belong to this list");
        sc.close();
    }
}
