package com.LoopsandConditionals;

import java.util.Scanner;

public class SomeQues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        // Q: Find the largest of the 3 numbers
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);


        // Q.2
        ///// Casecheck
////        char ch = in.next().trim().charAt(0);
//        String word = "hello";
//        System.out.println(in.next().trim());

        int a = 10;
        int b = 40;

//        if (a == 10 && b == 20){                  /* && means both the condition need to be true
//            System.out.println("hello world");
//        }

//        if (a == 10 || b == 20){   /* this is "or" */
//            System.out.println("hello world");
//        }

//        if (a != 100){  /* this is "not equal to" */
//            System.out.println("Hello world");
//        }

//        Q. Find the n'th fibonacci number?
//        int n = in.nextInt();
//        int p = 0;
//        int i = 1;
//        int count = 2;
//
//        while (count <= n) {
//            int temp = i;
//            i = i + p;
//            p= temp;
//            count++;
//        }
//        System.out.println(i);

//        int n = 12223452;
//
//        int count = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 2){
//                count++;
//            }
//            n = n /10; // n 1/=10
//
//        }
//        System.out.println(count);

        // Reverse
        int num = 6496848;

        int ans = 0;

        while (num > 0 ) {
            int rem = num % 10 ;
            num /= 10;

            ans = ans * 10 + rem;

        }
        System.out.println(ans);

    }
}


























