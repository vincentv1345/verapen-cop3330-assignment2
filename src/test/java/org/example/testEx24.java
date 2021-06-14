package org.example;
import ex24.getWords;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
public class testEx24 {
    public class checkAnagrams extends getWords {
        @Test
        public boolean checkLength(String word1, String word2)
        {
            word1 = "hello";
            word2 = "bread";
            boolean x = false;
            if(word1.length() == word2.length())
            {
                x = true;
            }
            return x;
        }@Test
        public void checkIfAnagram(String word1, String word2, boolean x)
        {
            word1 = "gainly";
            word2 = "laying";
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

}
