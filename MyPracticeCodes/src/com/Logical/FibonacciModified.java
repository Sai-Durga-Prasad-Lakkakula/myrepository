//Nth number in the modified Fibonacci sequence.

package com.Logical;

import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal t1 = new BigDecimal(sc.nextInt());
        BigDecimal t2 = new BigDecimal(sc.nextInt());
        int n = sc.nextInt();

        BigDecimal sum = new BigDecimal(0);
        for (int i = 3; i <= n; i++) {
            sum = t1.add(t2.multiply(t2));
            t1 = t2;
            t2 = sum;
        }
        System.out.println(sum);
        sc.close();
    }
}
