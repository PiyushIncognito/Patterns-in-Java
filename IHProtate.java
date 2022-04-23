package com.javalove;

public class IHProtate {
    public static void main(String[] args) {
        int n= 4;

        // outer loop
        for (int i = 1; i <= n ; i++) {

            // inner loop -> space print
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            // inner loop -> star print
            for (int j = 1; j <=i; j++) {
                System.out.print("*"); // if we write code like System.out.println("*"+" "); then it will print a full pyramid
            }
            System.out.println();
        }
    }
}
