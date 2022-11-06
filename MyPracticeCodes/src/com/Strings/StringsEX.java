//Find the Index of the First Occurrence in a String

package com.Strings;

import java.util.Scanner;

public class StringsEX {
    public int strStr(String haystack, String needle) {

        int needleLength = needle.length();

        if (needleLength == 0)
            return -1;

        int haystackLength = haystack.length();

        if (needleLength > haystackLength)
            return -1;

        for (int i = 0; i < haystackLength - needleLength + 1; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringsEX obj = new StringsEX();
        String haystack = sc.next();
        String needle = sc.next();
        System.out.println(obj.strStr(haystack, needle));
    }
}
