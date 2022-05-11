package com.javalove;
// Check if an array is sorted (Strictly Increasing)
public class SortedArray {
    public static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            // array is sorted till now
            return isSorted(arr, idx + 1);
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5};
        System.out.println(isSorted(arr, 0));
    }
}
