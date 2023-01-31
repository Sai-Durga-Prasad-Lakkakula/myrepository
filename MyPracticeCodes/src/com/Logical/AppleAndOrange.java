//Determine the number of apples and oranges that land on Sam's house.

package com.Logical;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int aCount = 0, oCount = 0;
        for (int i = 0; i < m; i++) {
            int temp = sc.nextInt();
            if ((a + temp) >= s && (a + temp) <= t) {
                aCount++;
            }
        }

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if ((b + temp) >= s && (b + temp) <= t) {
                oCount++;
            }
        }
        System.out.println(aCount);
        System.out.println(oCount);
        sc.close();
    }
}
