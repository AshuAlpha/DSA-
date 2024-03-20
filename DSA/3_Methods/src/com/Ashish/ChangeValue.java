package com.Ashish;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {1,2,6,3,45,7};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int @NotNull [] nums)
    {nums[1] = 99;
    }

}
