package com.Ashish;

import java.util.Scanner;

public class SUm {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3();// Assuming 'b' is supposed to be 30
        System.out.println(ans);
    }
    // pass the value of numbers when you are calling the method in main()
    static int sum3(){
        return 20 + 30;
    }
    //return the value
    static int sum2(){
        Scanner in  =  new Scanner(System.in);
//        int num1,num2,sum;
        System.out.print("Enter number:1 ");
        int num1 = in.nextInt();
        System.out.print("Enter number2 :   ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
        // return means function is over

//        System.out.println("This will never execute");  // This is Unreachable statement
    }



//    static void sum(){
//        Scanner in  =  new Scanner(System.in);
////        int num1,num2,sum;
//        System.out.print("Enter number:1 ");
//        int num1 = in.nextInt();
//        System.out.print("Enter number2 :   ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum= "+sum);
//    }
    }

    /*
    access modifier(We'll look in oop)  return_type (){
        //body
        return statement;
    }
     */


