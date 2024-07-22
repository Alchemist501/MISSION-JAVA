// Problem Description : https://leetcode.com/problems/reverse-vowels-of-a-string/description/

class Solution {
    public static String reverseVowels(String s) {
        char x;
        boolean [] vowels = new boolean[128];
        char [] tempArray = s.toCharArray();
        int i = 0;
        int j = tempArray.length-1;
        for( char c : "aeiouAEIOU".toCharArray()){
            vowels[c] = true;
        }
        while(i<j){
            while(i<j && !vowels[tempArray[i]])
                i++;
            while(i<j && !vowels[tempArray[j]])
                j--;
            if(i<j){
                x = tempArray[i];
                tempArray[i++] = tempArray[j];
                tempArray[j--] = x;
            }
        }
        return String.valueOf(tempArray);
    }
    public static void main(String[] args) {
        reverseVowels("hiiii");
    }
}