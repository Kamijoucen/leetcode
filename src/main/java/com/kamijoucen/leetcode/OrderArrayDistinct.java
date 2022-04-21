package com.kamijoucen.leetcode;

public class OrderArrayDistinct {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        orderArrayDistinct(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void orderArrayDistinct(int[] arr) {

        if (arr.length == 1) {
            return;
        }
        int distincted = 1;
        int prex = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            if (arr[i] != prex) {
                arr[i] = arr[distincted];
                arr[distincted] = temp;
                distincted++;
            }
            prex = temp;
        }

    }

}
