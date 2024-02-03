import java.util.Scanner;

public class Arrays {
    static int i;

    static int Search(int x, int array[]) {
        for (i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the size of the array :");
        int size = sc.nextInt();
        // Array declaration
        int array[] = new int[size];
        // Entering elements into the array
        for (i = 0; i < size; i++)
            array[i] = sc.nextInt();
        System.err.print("Enter the element to be searched for: ");
        int x = sc.nextInt();
        int pos = Search(x, array);
        if (pos != 0)
            System.err.println(x + " is found at position " + (pos + 1));
        else
            System.err.println("The element doesn't belong to this list");
        sc.close();
    }
}
/*
 * Syntax for declaration
 * type [] arrayName = new type [size]
 * type arrayName [] = {element1,element2}
 * If an array is declared of any size and we didn't initialized the array with
 * any value then the default value will be 0 for type int , 0.0 for type double
 * , " " for string, false for boolean
 */