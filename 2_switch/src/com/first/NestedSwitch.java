package com.first;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String departed = in.next();

        switch (empId) {
            case 1 -> System.out.println("Ashish patil");
            case 2 -> System.out.println("Rahul randa");
            case 3 -> {
                System.out.println("Emp no. 3");
                switch (departed) {
                    case "IT" -> System.out.println("IT dep");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No dep entered");
                }
            }
            default -> System.out.println("Enter Correct Em ID");
        }
    }
}
