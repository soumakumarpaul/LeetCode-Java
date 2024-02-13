// 1768 Merge Strings Alternatively

// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
// If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the Merged String

public class MergeStrings {
    
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        char[] result = new char[len1 + len2];
        int i = 0, j = 0;
        while(j < result.length) {
            if(i < len1) {
                result[j++] = word1.charAt(i);
            }
            if(i < len2) {
                result[j++] = word2.charAt(i);
            }
            ++i;
        }
        return new String(result);
    }
}
