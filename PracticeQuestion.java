package com.javalove;

import java.util.Scanner;



public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int curr = 0;
        int prev = 1;

        for (int count = 2; count <= n; count++) {
            int temp = curr;
            curr = curr+prev;
            prev = temp;
        }
        System.out.println(curr);
    }






        //Q. Write a function which takes in 2 numbers and returns the greater of those two.
//    public static void greater(int a, int b) {
//        if(a>b){
//            System.out.println(a+" is greater than " +b);
//        }else{
//            System.out.println(b+" is greater than "+a);
//        }
//    }

//        int a = in.nextInt();
//        int b = in.nextInt();
//        greater(a,b);

        //Q. Write a function to print the sum of all odd numbers from 1 to n.
//    public static int oddnum(int n) {
//        int sum=0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//        return sum;
//    }

    //        int n = in.nextInt();
    //        oddnum(n);

        //Q. Average of three numbers
//    public static void average(int num1, int num2, int num3){
//        int num = (num1+num2+num3)/3;
//        System.out.println(num);
//        return;
//    }
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int num3 = in .nextInt();
//        average(num1,num2,num3);


}
