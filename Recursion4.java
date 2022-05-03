package com.javalove;
//Find the first & last occurence of an element in string
public class Recursion4 {
    public static int first = -1; //-1 is an invalid element to initialise
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
        }


        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurence(str, idx+1,element);
    }
    public static void main(String[] args) {
        String str = "abaabhaadhaaf";
        findOccurence(str, 0,'a');
    }
}
