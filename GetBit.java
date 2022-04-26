package com.javalove;

public class Bits {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitmask = 1<<position;

        if((bitmask & n) == 0){
            System.out.println("Bitmask was zero");
        } else {
            System.out.println("Bitmask was one");
        }
    }
}
