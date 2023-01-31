//Counting the number of divisors occurring within the integer.

package com.Logical;

import java.util.Scanner;

public class FindDigits {
    static int findDigits(int n) {
        int count = 0;
        int num = n;
        while (n > 0) {
            int r = n % 10;
            if (r != 0 && num % r == 0)
                count++;
            n = n / 10;

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            System.out.println(findDigits(input));
        }
        sc.close();
    }
}
