package com.javalove;

import java.util.Scanner;

public class FactorialCode {
    public static void factorialNum(int n){
        if(n<0){
            System.out.println("Invalid Operation");
            return;
        }
        int factorial = 1;
        for (int i = n; i >=1 ; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        factorialNum(n);
    }
}
