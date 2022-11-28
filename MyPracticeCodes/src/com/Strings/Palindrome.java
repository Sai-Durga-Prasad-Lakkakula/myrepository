//Finding out whether the string is a palindrome or not

package com.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toLowerCase();
        s = s.replaceAll(" [,?/:;!]", "");
        char ch[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        boolean check = true;
        while (i < j) {
            if (check(ch[i]) == false) {
                i++;
                continue;
            }
            if (check(ch[j]) == false) {
                j--;
                continue;
            }
            if ((ch[i] != ch[j])) {
                check = false;
                break;
            }
            i++;j--;
        }
        if (check)
            System.out.println("YES");
        else
            System.out.println("NO");
    }


    public static boolean check(char c) {
        boolean f = false;
        byte b = (byte) c;
        if (b >= 97 && b <= 122) {
            return true;
        } else {
            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'
                    || c == '0')
                return true;
        }
        return f;
    }
}
