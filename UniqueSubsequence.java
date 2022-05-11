package com.javalove;

import java.util.HashSet;

//Print all the unique subsequences of a string
//Here we are using HashSet Data Structure
//str = "aaa"
public class UniqueSubsequence {
    public static void unique(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if (set.contains(newString)){
                return;
            } else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }


        char currChar = str.charAt(idx);

        //to be used
        unique(str, idx+1, newString+currChar, set);

        //not to be used
        unique(str, idx+1, newString, set);


    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        unique(str,0,"",set);
    }
}
//HashSet is a unique set