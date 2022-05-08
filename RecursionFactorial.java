package com.javalove;

public class RecursionFactorial {
    public static int printfact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_num = printfact(n-1);
        int fact = n * fact_num;
        return fact;

    }

    public static void main(String[] args) {
        int n = 4;
        int ans = printfact(n);
        System.out.println(ans);
    }
}
