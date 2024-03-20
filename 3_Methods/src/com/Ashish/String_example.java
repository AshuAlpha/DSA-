package com.Ashish;

import java.util.Scanner;

public class String_example {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.next();
        String pr = myGreet(name);
        System.out.println(pr);


    }

    private static String myGreet(String name) {
        return "Hello " + name;
    }

    static String greet(){
        return "how are you";
//      This is ^^ just the good and updated version of >> this..
//        String greeting = "how are you";
//        return greeting;

    }
}
