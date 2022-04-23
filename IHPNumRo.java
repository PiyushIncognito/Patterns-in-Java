package com.javalove;

public class IHPNumRo {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j); // if we write code like System.out.println("j"+" "); then it will print a full pyramid
            }
            System.out.println();
        }
    }
}
