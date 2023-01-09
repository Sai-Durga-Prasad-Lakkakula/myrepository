//The number of special problems in the workbook

package com.Logical;

import java.util.Scanner;

public class LisasWorkbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();

        }
        int result = getSepcialProblemCount(n, k, a);
        System.out.println(result);
        sc.close();
    }


    private static int getSepcialProblemCount(int n, int k, int[] a) {
        int pageNumber = 1, specialProblems = 0, problemNumber = 1;
        for (int chapterNumber = 1; chapterNumber <= n;) {
            int problemPerPage = (problemNumber + k - 1) < a[chapterNumber-1] ? problemNumber + k - 1 : a[chapterNumber-1];
            if (problemNumber <= pageNumber && pageNumber <= problemPerPage) {
                specialProblems++;
            }
            pageNumber++;
            problemNumber += k;
            if (problemNumber > a[chapterNumber-1]) {
                problemNumber = 1;
                chapterNumber++;
            }
        }
        return specialProblems;
    }
}
