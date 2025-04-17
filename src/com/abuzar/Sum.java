package com.abuzar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

    }

    void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter no 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Addition = " + sum);
    }
}
