package ex24;

public class AnagramChecker {
    public static void main(String []args)
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        checkAnagrams n = new checkAnagrams();
        String word1 = n.getWordOne();
        String word2 = n.getWordTwo();
        boolean length = n.checkLength(word1, word2);
        n.checkIfAnagram(word1, word2, length);
    }
}
