package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("*************************Palindrom Sayıyı Bulma******************");

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));


        System.out.println("*************************Mükemmel Sayıları Bulma******************");
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false


        System.out.println("*************************Sayıları Kelimelere Dökme******************");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

    }



    public static boolean isPalindrome(int number) {
        String str = Integer.toString(Math.abs(number)); // Negatif sayıları pozitif yap
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);


    }

    public static boolean isPerfectNumber(int number) {
    if(number<0){
        return  false;
    }
    int sum=0;
    for(int i=1; i<=number/2; i++){
        if(number%i==0){
            sum+=i;
        }
    }

        return sum==number;
    }


    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        StringBuilder result = new StringBuilder();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            result.append(words[digit]).append(" ");
        }

        return result.toString().trim();
    }
    }
