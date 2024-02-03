public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hell");
        System.err.println(sb);
        // update charAt(0)
        sb.setCharAt(0, 'W');
        System.err.println(sb);
        sb.insert(1, 'W');
        System.err.println(sb);
        sb.delete(0, 3);
        System.err.println(sb);
        sb.append('e');
        sb.append('w');
        System.err.println(sb.length());
    }
}
/*
 * As java is a immutable language we need to create new variable to update an
 * existing string which is a long process. Instead of doing that we use String
 * Builder class.We can update a string using the same variable using this class
 * Declaration =>StringBuilder name = new StringBuilder("String");
 * Change a character => name.setCharAt(Index,'Character');
 * Insert a character => name.insert(Index,'Character');
 * Delete => name.delete(BeginIndex,EndIndex);
 * Append => name.append('Character');
 * findLength => name.length()
 */