package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        task1(arr);
        task2(arr);
        task3(arr);
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(int[] arr) {
        int summ1 = Arrays.stream(arr).sum();

        int summ2 = 0;
        for (int i : arr) {
            summ2 = summ2 + i;
        }
        System.out.println("Сумма трат за месяц составила " + summ2 + " рублей");
    }

    public static void task2(int[] arr) {
        int min1 = Arrays.stream(arr).min().getAsInt();
        int max1 = Arrays.stream(arr).max().getAsInt();

        int max2 = -1;
        int min2 = 100000000;
        for (int i : arr) {
            if (max2 <= i) {
                max2 = i;
            }
            if (min2 >= i) {
                min2 = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min2 +" рублей. " +
                "Максимальная сумма трат за день составила " + max2 + " рублей");
    }

    public static void task3(int[] arr) {
        double avg1 = Arrays.stream(arr).average().getAsDouble();

        int summ = 0;
        for (int i : arr) {
            summ += i;
        }
        float avg2 = (float) summ / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg2 + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
    }
}
