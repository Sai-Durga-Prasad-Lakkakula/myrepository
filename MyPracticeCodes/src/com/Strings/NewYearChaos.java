//Determining the minimum number of bribes that took place to get to a given queue order.

package com.Strings;

import java.util.Scanner;

public class NewYearChaos {
    private static void minimumBribes(int[] arr) {
        int swapCount = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != i + 1) {

                if (((i - 1) >= 0) && arr[i - 1] == (i + 1)) {
                    swapCount++;
                    swap(arr, i, i - 1);
                } else if (((i - 2) >= 0) && arr[i - 2] == (i + 1)) {

                    swapCount += 2;
                    swap(arr, i - 2, i - 1);
                    swap(arr, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }

        }
        System.out.println(swapCount);

    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            minimumBribes(a);
        }
        sc.close();
    }
}
