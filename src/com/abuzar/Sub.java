package com.abuzar;

import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {

    }

    void Sub(){

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter num 1: ");
        int num1= in.nextInt();
        System.out.println("Please enter num 2: ");
        int num2= in.nextInt();
        int sub = num2 - num1;
        System.out.println("Subtraction   : " +  sub);

    }
}
