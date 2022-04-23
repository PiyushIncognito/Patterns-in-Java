package com.javalove;

public class ButterFlyPattern {
    public static void main(String[] args) {
        int n = 5;


        //  Upper Half
        for (int i = 1; i <= n ; i++) {
            //Left side * part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //spaces between the stars
            int spaces = 2*(n-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            //right side * part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //  Lower Half
        for (int i = n; i >= 1 ; i--) {
            //Left side * part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            //spaces between the stars
            int spaces = 2*(n-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            //right side * part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
