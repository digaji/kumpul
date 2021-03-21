package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AscendedExercise2 {
    public static void main(String[] args) {
        // Take a String input (word or sentence)
        // After every syllable, place " between last vowel and repeat vowel again
        // Examples
        // Apa kabar -> A"Apa"a Ka"aba"ar
        // Manggang Ayam -> Ma"angga"ang A"Aya"am
        // Indonesia -> I"Indo"one"esi"ia"a

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to vowel repeater\n\nWhat's your word/sentence today:");
        System.out.println("Word / sentence >>");
        String input = sc.nextLine();

        String regex = "[aeiou]";

        // Compile regex pattern
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        // Match regex with input
        Matcher matcher = pattern.matcher(input);
        // Use StringBuffer for final output
        StringBuffer stringBuffer = new StringBuffer();

        // For each match, append the replacement to stringBuffer
        while (matcher.find()) {
            String replace = String.format("%s\"%s", matcher.group(), matcher.group());
            matcher.appendReplacement(stringBuffer, replace);
        }
        // Don't forget the last character
        matcher.appendTail(stringBuffer);

        System.out.println(input + "  -->  " + stringBuffer.toString());
    }
}
