//finding the minimum distance between any pair of equal elements in the array.

package com.Logical;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumDistances {
    static int minimumDistances(int[] a) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE, prevIndex = 0, currentIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (hmap.containsKey(a[i])) {
                currentIndex = i;
                prevIndex = hmap.get(a[i]);
                minDistance = Math.min((currentIndex - prevIndex), minDistance);
            }
            hmap.put(a[i], i);
        }

        return (minDistance == Integer.MAX_VALUE ? -1 : minDistance);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(minimumDistances(a));
        sc.close();
    }
}
