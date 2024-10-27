package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }


    public static boolean isPalindrome(int number) {
        String str = Integer.toString(Math.abs(number)); // Negatif sayıları pozitif yap
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);


    }

    public static boolean isPerfectNumber() {
        return false;
    }

    public static boolean numberToWords() {
        return false;

    }
}