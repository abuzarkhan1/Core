package com.abuzar;

import java.util.Scanner;

public class Div {
    public static void main(String[] args) {

    }

    void Div(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Num 1 : ");
        int num1 = in.nextInt();
        System.out.println("Please Enter Num2 : ");
        int num2 = in.nextInt();
        int div = num1/num2;
        System.out.println("Division : " + div);
    }
}
