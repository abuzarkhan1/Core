package com.abuzar;

import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {

    }

    void Mult(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Num 1: ");
        int num1 = in.nextInt();
        System.out.println("Please Enter Num 2: ");
        int num2 = in.nextInt();
        int mult = num1 * num2;
        System.out.println("Multiplication : " + mult);
    }
}
