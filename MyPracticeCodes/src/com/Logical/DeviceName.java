//create the unique folder name for it’s os

package com.Logical;

import java.util.*;

public class DeviceName {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            String str=sc.next();
            if(map.containsKey(str))
            {
                int count=map.get(str);
                count=count+1;
                map.put(str,count);
            }
            else
                map.put(str,1);
        }

        Set s=map.entrySet();
        Iterator itr=s.iterator();

        while(itr.hasNext())
        {
            Map.Entry m=(Map.Entry)itr.next();
            int value=(Integer)m.getValue();
            System.out.println(m.getKey());
            value--;
            for(int i=1;i<=value;i++)
            {
                System.out.println(m.getKey()+""+i);
                value--;
            }
        }
    }
}
