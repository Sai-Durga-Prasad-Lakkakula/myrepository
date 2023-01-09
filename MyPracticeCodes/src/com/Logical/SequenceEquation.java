// Arithmetic sequence

package com.Logical;

import java.util.Scanner;

public class SequenceEquation {
    public static int getIndexOfIndex(int a[], int key, int j) {
        if (j-- <= 0) {
            return key;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == key) {
                    return getIndexOfIndex(a, i, j);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(getIndexOfIndex(a, i, 2));

        }
        sc.close();
    }
}
