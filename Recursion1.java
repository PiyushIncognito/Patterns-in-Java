package com.javalove;
// print num from 1 to 5
public class Recursion1 {

    public static void printNum(int n){
        if (n == 6){ //Base Case
            return;
        }
        System.out.println(n); //print
        printNum(n+1); //recursion
    }
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
}
