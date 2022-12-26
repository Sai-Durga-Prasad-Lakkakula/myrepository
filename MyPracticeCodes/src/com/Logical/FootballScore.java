//The total number of matches of team A where team A has won less than or equal to the number of wins scored by team B in that match

package com.Logical;

import java.util.Arrays;
import java.util.Scanner;

public class FootballScore {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int teamA[]=new int[n];
        for(int i=0;i<n;i++)
            teamA[i]=sc.nextInt();

        int m=sc.nextInt();
        int teamB[]=new int[m];
        for(int i=0;i<m;i++)
            teamB[i]=sc.nextInt();
        Arrays.sort(teamA);
        int count=0;
        for(int i=0;i<m;i++)
        {
            count=0;
            for(int j=0;j<n;j++)
            {
                if(teamA[j]<=teamB[i])
                    count++;
                else
                    break;
            }
            System.out.println(count);
        }
    }
}
