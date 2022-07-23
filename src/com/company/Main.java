package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        reverseWords("<[] there is a light that never goes out");
//        reverseWords2("<[] there is a light that never goes out");
//        whoLikesIt("mike", "joe", "bobby", "stan");
//        System.out.println(toJadenCase("what is going on here"));
        System.out.println(getXO("xooxXXoohj"));
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
        for(int i = 0; i < small.length(); i++){
            if(small.charAt(i) =='o'){
                countO += 1;
            }else if(small.charAt(i) == 'x'){
                countX += 1;
            }
        }
        return  countO == countX;
    }


//end of main class
}

//    int solution(int[] a, int k) {
//
//
//        Arrays.sort(a);
//        int l = 1;
//        int r = a[a.length - 1];
//        int res = -1;
//        while (l <= r) {
//            int mid = l + (r - l) / 2;
//            int sum = 0;
//            for (int i = 0; i < a.length; i++) {
//                int cnt = a[i] / mid;
//                sum += cnt;
//            }
//            if (sum >= k) {
//                res = mid;
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
//        }
//        return res;
//    }