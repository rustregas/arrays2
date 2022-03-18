package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        task1(arr);
        task2(arr);
        task3(arr);
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
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

        int max2 = arr[0];
        int min2 = arr[0];
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

    public static void task5() {
        int[][] matrix = new int [3][3];
        int value = 1;
        for(int i = 0; i < matrix.length; ++i){
            matrix[matrix.length-1 - i][i] = value;
            matrix[i][i] = value;
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int[] arr = {5,4,3,2,1};
        int[] arr2 = Arrays.stream(arr).sorted().toArray();

        System.out.println(Arrays.toString(arr2));
    }

    public static void task7() {
        int[] arr = {9,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length/2; ++i) {
            int elem = arr[i];
            arr[i] = arr[arr.length-1 - i];
            arr[arr.length-1 - i] = elem;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task8() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1, -1000, 998};
        int cntFlg = 0;

        for(int j = 0; j < arr.length; j++){
            for (int i = j+1; i < arr.length; i++) {
                if(arr[i] + arr[j] == -2 && cntFlg<2) {
                    System.out.println(arr[j]+" + "+arr[i]+ " = -2");
                    cntFlg++;
                }
            }
        }
    }

    public static void task9() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1, -1000, 998};

        for(int j = 0; j < arr.length; j++){
            for (int i = j+1; i < arr.length; i++) {
                if(arr[i] + arr[j] == -2 ) {
                    System.out.println(arr[j]+" + "+arr[i]+ " = -2");
                }
            }
        }

    }

}
