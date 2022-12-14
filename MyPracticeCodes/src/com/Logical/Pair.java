//The minimum number of street lights that must be activated

package com.Logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pair {
    Integer a;
    Integer b;
    Pair(){

    }
    Pair(Integer a,Integer b){
        this.a=a;
        this.b=b;
    }
    public Integer getA() {
        return a;
    }
    public void setA(Integer a) {
        this.a = a;
    }
    public Integer getB() {
        return b;
    }
    public void setB(Integer b) {
        this.b = b;
    }

}
class SortingPair implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        if(o1.getA()==o2.getA()) {
            if(o1.getB()<o2.getB()) {
                return 1;
            }else {
                return 0;
            }
        }
        if(o1.getA()<o2.getA()) {
            return 1;
        }else {
            return 0;
        }
    }
}
 class Application2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int location[]=new int[n];
        for(int i=0;i<n;i++) {
            location[i]=sc.nextInt();
        }
        System.out.println(solve(location,n));
    }
    private static int solve(int[] location, int n) {
        Pair range[] = new Pair[n];
        for(int i=0;i<n;i++) {
            int id=i+1;
            range[i] = new Pair();
            range[i].setA(Math.max(1, id-location[i]));
            range[i].setB(Math.min(n, id+location[i]));
        }
        Arrays.sort(range,new SortingPair());
        int i=0,ans=0;
        while(i<n) {
            Pair p=range[i];
            ans++;
            while(i+1<n && range[i].getA()==range[i+1].getA()) {
                p.b=Math.max(p.getB(), range[i+1].getB());
                i++;
            }
            while(i<n && range[i].getB()<=p.getB()) {
                i++;
            }
        }
        return ans;
    }
}
