//number of letters changed during transmission.

package com.Logical;

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        String tmp = "SOS";
        int n = l / 3;
        String newString = tmp;
        for (int i = 1; i < n; i++) {
            newString += tmp;
        }
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (newString.charAt(i) != s.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
