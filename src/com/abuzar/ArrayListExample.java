package com.abuzar;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(12);
//        System.out.println(list);

        Scanner in = new Scanner(System.in);

        for (int i=0; i<5; i++){
            list.add((in.nextInt()));
        }

        for (int i=0; i<5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
