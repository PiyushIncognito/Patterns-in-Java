package com.javalove;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper= 1 means set and oper= 0 means clear
        int n= 5; //0101
        int pos = 1;

        int bitmask = 1<<pos;
        if (oper == 1){
            int newNum = bitmask | n;
            System.out.println(newNum); //0111 -> 7
        } else{
            int newBitmask = ~(bitmask);
            int newNum = newBitmask & n;
            System.out.println(newNum);
        }

    }
}
