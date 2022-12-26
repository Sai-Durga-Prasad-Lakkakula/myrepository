//finding the maximum lighthouses which have absolute difference less than or equal to 1 between adjacent numbers

package com.Logical;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int count=0;
        int max=-1;

        for(int i=0;i<n-1;i++)
        {
            if((arr[i+1]-arr[i]==0 ) ||  (arr[i+1]-arr[i]==1))
                count++;
            else
            {
                if(count+1>max)
                    max=count+1;
                count=0;
            }
        }
        System.out.println(max);
    }
}
