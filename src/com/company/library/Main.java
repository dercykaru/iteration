package com.company.library;

public class Main {

    public static void main(String[] args) {

        for (int r : new RandomNumbers(90, 100)) {
            System.out.println("Случайное число r = " + r);
            if (r == 100) {
                System.out.println("И закончили...");
                break;
            }
        }
    }
}