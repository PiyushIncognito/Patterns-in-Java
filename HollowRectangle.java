package com.javalove;

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 4;  // for row
        int m = 5;  // for columns

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if (i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
