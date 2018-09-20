package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] list = {5, 7, 9, 3, 4, 1};

        bubbleSort(list);

        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] < list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
