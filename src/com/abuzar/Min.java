package com.abuzar;

public class Min {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int minVal = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
