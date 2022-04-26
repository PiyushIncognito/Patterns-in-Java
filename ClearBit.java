package com.javalove;

public class ClearBit {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitmask = 1<<position;

        int clearnum = ~(bitmask) & n;
        System.out.println(clearnum);
    }
}
