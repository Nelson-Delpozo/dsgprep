package com.company;

import java.sql.Array;
import java.util.*;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        reverseWords("<[] there is a light that never goes out");
//        reverseWords2("<[] there is a light that never goes out");
//        whoLikesIt("mike", "joe", "bobby", "stan");
//        System.out.println(toJadenCase("what is going on here"));
//        System.out.println(getXO("xooxXXoohj"));
//        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
//        System.out.println(makeComplement("ATTGC"));
//        System.out.println(isTriangle(1,2,2));
//        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
//        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(pigIt("Pig latin is cool"));


    }

    public static void reverseWords(final String original) {

        char ch;
        String[] split = original.split("\\s+");
        ArrayList<String> wordsReversed = new ArrayList<>();


        for (String word : split) {
            String newString = "";
            for (int i = word.length() - 1; i >= 0; i--) {

                ch = word.charAt(i); //extracts each character
                newString = newString + ch;

            }
            wordsReversed.add(newString);
        }
        String finalString = "";
        for (String words : wordsReversed) {
            finalString = finalString + " " + words;
        }

        System.out.println(Arrays.toString(split));
        System.out.println(wordsReversed);
        System.out.println(finalString);


    }

//    public static String reverseWords(final String original) {
//
//        char ch;
//        String[] split = original.split("\\s+");
//        List<String> wordsReversed = new ArrayList<>();
//
//
//        for (String word : split) {
//            String newString = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//
//                ch = word.charAt(i); //extracts each character
//                newString = newString + ch;
//
//            }
//            wordsReversed.add(newString);
//        }
//        String finalString = "";
//        for (String words : wordsReversed){
//            finalString = finalString + " " + words;
//        }
//
//        return finalString;
//
//    }

    public static void reverseWords2(final String original) {
        String[] array = original.split(" ");

        int i = 0;
        for (String string : array) {
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        System.out.println(String.join(" ", array));
    }

    public static void whoLikesIt(String... names) {

        if (names.length == 0) {
            System.out.println("no one likes this");
        } else if (names.length == 1) {
            System.out.println(names[0] + " likes this");
        } else if (names.length == 2) {
            System.out.println(names[0] + " and " + names[1] + " like this");
        } else if (names.length == 3) {
            System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " like this");
        } else {
            System.out.println(names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this");
        }
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        }
        if (phrase.equals("")) {
            return null;
        }

        String[] array = phrase.split(" ");


        ArrayList<String> words = new ArrayList<>();
        for (String word : array) {
            String s = word.substring(0, 1).toUpperCase() + word.substring(1);
            words.add(s);
        }
        return (String.join(" ", words));
    }

    public static boolean getXO(String str) {
        String small = str.toLowerCase();
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < small.length(); i++) {
            if (small.charAt(i) == 'o') {
                countO += 1;
            } else if (small.charAt(i) == 'x') {
                countX += 1;
            }
        }
        return countO == countX;
    }


    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int num : a) {
            listA.add(num);
        }
        for (int num : b) {
            listB.add(num);
        }
        listA.removeAll(listB);
        int[] result = new int[listA.size()];

        for (int i = 0; i < listA.size(); i++) {
            result[i] = listA.get(i);
        }
        return result;
    }

    public static String makeComplement(String dna) {

        String[] string = dna.split("");
        System.out.println(Arrays.toString(string));

        for (int i = 0; i < string.length; i++) {

            if (string[i].equals("G")){
                string[i] = "C";
                continue;
            }
            if (string[i].equals("C")){
                string[i] = "G";
                continue;
            }
            if (string[i].equals("A")){
                string[i]  = "T";
                continue;
            }
            if (string[i].equals("T")){
                string[i] = "A";

            }
        }
        return String.join("", string);
    }

    public static boolean isTriangle(int a, int b, int c){

        return (((a + b) > c) && ((a + c) > b) && ((b + c) > a));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder string = new StringBuilder();
        for(int num : binary){
            string.append(num);
        }
        return Integer.parseInt(String.valueOf(string), 2);
    }

    public static String createPhoneNumber(int[] numbers) {

        return String.format("(%d%d%d) " + "%d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String pigIt(String str) {

        String[] array = str.split(" ");
        StringJoiner result = new StringJoiner(" ");
        for(String word : array){

            String newWord = String.format("%s%say",word.substring(1), word.charAt(0));
            result.add(newWord);

        }

        return result.toString();
    }



//end of main class
}
