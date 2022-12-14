//Maximal value of the xor operations for all permutations of the integers.

package com.Logical;

import java.util.Scanner;

public class MaximizingXor {
    static int maxXor(int l, int r) {
        int maxXor = 0;
        for (int i = l; i < r; i++) {
            int temp;
            temp = i ^ (i + 1);
            if (temp > maxXor) {
                maxXor = temp;
            }
        }

        return maxXor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);
        in.close();
    }
}
