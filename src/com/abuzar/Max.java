package com.abuzar;

public class Max {

    public static void main(String[] args) {

        int[] arr = {1,23,45,56,78,89,99};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }



}
