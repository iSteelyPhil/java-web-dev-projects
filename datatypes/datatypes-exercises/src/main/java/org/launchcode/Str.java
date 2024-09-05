package org.launchcode;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";


        Scanner input = new Scanner(System.in);


        System.out.print("Enter a term to search for: ");
        String searchTerm = input.nextLine();

        String lowerCaseSentence = sentence.toLowerCase();
        String lowerCaseSearchTerm = searchTerm.toLowerCase();


        Boolean found = lowerCaseSentence.contains(lowerCaseSearchTerm);


        System.out.println("The search term \"" + searchTerm + "\" was found: " + found);


        Integer index = lowerCaseSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = lowerCaseSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);
        input.close();
    }
}
