package com.javalove;
//Remove the duplicates in a string

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26]; //26 Character of English characters is stored

    public static void removeDuplicates(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx+1,newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str,0,"");
    }
}
