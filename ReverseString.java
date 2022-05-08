package com.javalove;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        for (int i = 0; i <=str.length()/2; i++) {
            int front = i; //Index of first characters
            int back = str.length() - 1 - i; //5-1-0 == 4 index of last characters

            char frontChar = str.charAt(front); // char at front index
            char backChar = str.charAt(back); //char at last index

            str.setCharAt(front, backChar); //front = index no. | backChar = char itself
            str.setCharAt(back, frontChar); //back = index no. | frontChar = char itself
        }
        System.out.println(str);
    }
}
