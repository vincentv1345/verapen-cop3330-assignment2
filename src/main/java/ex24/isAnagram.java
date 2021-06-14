package ex24;
import java.util.Arrays;

public class isAnagram extends getWords{
    public boolean checkLength(String word1, String word2)
    {
        boolean x = false;
        if(word1.length() == word2.length())
        {
            x = true;
        }
        return x;
    }
    public void checkIfAnagram(String word1, String word2, boolean x)
    {
        if(x == true) {
            char[] array1 = word1.toCharArray();
            char[] array2 = word2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            if (Arrays.equals(array1, array2)) {
                System.out.println(word1 + " and " + word2 + " are anagrams.");
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagrams.");
            }
        }
        else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }
}
