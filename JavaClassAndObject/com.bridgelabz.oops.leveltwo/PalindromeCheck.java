package com.bridgelabz.oops.leveltwo;

public class PalindromeCheck {
    String text;

    PalindromeCheck(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String cleantext = text.replaceAll("\\s", "").toLowerCase();
        String reverseText = new StringBuilder(cleantext).reverse().toString();
        return cleantext.equals(reverseText);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeCheck checker1 = new PalindromeCheck("A man a plan a canal Panama");
        checker1.displayResult();
        PalindromeCheck checker2 = new PalindromeCheck("Hello");
        checker2.displayResult();
    }
}