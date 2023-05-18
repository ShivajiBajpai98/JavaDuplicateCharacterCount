package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacter {
    public void findCharacter() {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String inputString = scanner.nextLine();

        char[] charArray = inputString.toCharArray();

        // Count the occurrence of each character
        for (char ch : charArray) {
            if (charCountMap.containsKey(ch)) {
                // If the character is already present, increment its count
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If the character is encountered for the first time, add it to the map with count 1
                charCountMap.put(ch, 1);
            }
        }

        // Iterate over the character keys in the map
        Set<Character> keys = charCountMap.keySet();
        for (Character ch : keys) {
            if (charCountMap.get(ch) > 1) {
                // Print the character and its count if it occurs more than once
                System.out.println(ch + " is repeated " + charCountMap.get(ch) + " times");
            }
        }
    }

    public static void main(String[] args) {
        DuplicateCharacter duplicateCharacter = new DuplicateCharacter();
        duplicateCharacter.findCharacter();
    }
}
