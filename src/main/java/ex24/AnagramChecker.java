package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Vincent Verapen
 */
public class AnagramChecker {
    public static void main(String []args)
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        isAnagram n = new isAnagram();
        String word1 = n.getWordOne();
        String word2 = n.getWordTwo();
        boolean length = n.checkLength(word1, word2);
        n.checkIfAnagram(word1, word2, length);
    }
}
