package com.abuzar;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("For Addition Press 1");
        System.out.println("For Subtraction Press 2");
        System.out.println("For Multiplication Press 3");
        System.out.println("For Addition Press 4");

        int choice = in.nextInt();

        if (choice == 1){
            Sum sum = new Sum();
            sum.sum();
        } else if (choice == 2) {
            Sub sub = new Sub();
            sub.Sub();
        } else if (choice == 3) {
            Multi mul = new Multi();
            mul.Mult();
        } else if (choice == 4) {
            Div div = new Div();
            div.Div();
        }else{
            System.out.println("Please Select The Right Option");
        }

    }
}