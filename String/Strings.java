import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Input your first name: ");
        String firstName = sc.next();
        System.err.print("Input your last name: ");
        String lastName = sc.next();
        String fullName = firstName + lastName;// Concatenation
        System.err.println("Your name is : " + fullName);
        System.err.println("Length of your name is : " + fullName.length()); // Length
        // Display as an array of characters
        for (int i = 0; i < fullName.length(); i++)
            System.err.print(fullName.charAt(i) + " ");
        if (firstName.compareTo(lastName) == 0)
            System.err.println("The are equal");
        else
            System.err.println("THey are NOT equal");
        System.err.println("The substring of your name is " + fullName.substring(5));
        sc.close();
    }
}
/*
 * Declaration : String name = "udhociwiec";
 * next() can be used to enter a word and nextLine can be used to enter a
 * sentence.
 * Operations =>
 * 1)Concatenation: using + operator . If we need space btw them add empty
 * string " "
 * 2)Length : using .length() function . Returns the length of the string
 * 3)Access : using charAt() function . Parameter passed => index. Returns the
 * character at the given index
 * 4)Comparison => string1.compareTo(string2)
 * if string1 >string2 returns +ve
 * if string1==string2 returns 0
 * if string1<string2 returns -ve
 * => == operator
 * returns true only if they are --------
 * 5)SubString => .substring(beginIndex,endIndex) if endIndex is not mentioned
 * then it will be by default the lastIndex of the string
 * 6)Strings are immutable
 */