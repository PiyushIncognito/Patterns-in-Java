package com.javalove;

public class SetBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int position = 1;
        int bitmask = 1<<position; //left shift by position

        int newnum = bitmask | n;
        System.out.println(newnum);
    }
}
