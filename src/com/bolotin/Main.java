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
        System.out.println("Задача 2");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1]) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == arr2[arr2.length - 1]) {
                    System.out.println(arr2[i]);
                } else {
                    System.out.print(arr2[i] + ", ");
                }
        }
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == arr3[arr.length - 1]) {
                System.out.println(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }

        // Задача 3
        System.out.println("Задача 3");

        for (int i = arr.length - 1; i >= 0; i --) {
            if (i == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        for (int i = arr2.length - 1; i >= 0; i --) {
            if (i == 0) {
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        for (int i = arr3.length - 1; i >= 0; i --) {
            if (i == 0) {
                System.out.println(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }

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
