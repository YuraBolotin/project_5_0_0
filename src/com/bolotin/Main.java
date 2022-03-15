package com.bolotin;

public class Main {

    public static void main(String[] args) {
        // Задача 1

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        int[] arr3 = new int[]{2, 4, 6};

        // Задача 2

        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println(arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
        System.out.println(arr3[0] + ", " + arr3[1] + ", " + arr3[2]);

        // Задача 3

        System.out.println(arr[2] + ", " + arr[1] + ", " + arr[0]);
        System.out.println(arr2[2] + ", " + arr2[1] + ", " + arr2[0]);
        System.out.println(arr3[2] + ", " + arr3[1] + ", " + arr3[0]);

        // Задача 4
        System.out.println("Задача 4");


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
                }

                if (arr[i] == arr [arr.length - 1]) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ", ");
                }

        }
    }
 }
