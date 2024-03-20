package com.Ashish;

import java.util.Arrays;

public class Var_args {
    public static void main(String[] args) {
//        fun(2,3,4,5,6,7,8,8);
        multiple(2,3,4,"Ashish");
    }

    static void multiple(int a, int b, int c, String...v){

    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
