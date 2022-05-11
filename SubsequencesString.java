package com.javalove;
//<<<<<-----IMPORTANT----->>>>>
//Print all subsequences of a string
//Subsequence -> if a string is given then make a new substring form its character
//Time complexity is O(2^n)
//str = "abc"
public class SubsequencesString {
    public static void subsequences(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        //char is to be used
        subsequences(str, idx+1, newString+currChar);

        //char is not to be used
        subsequences(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str,0,"");
    }
}
