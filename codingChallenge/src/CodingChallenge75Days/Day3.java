package CodingChallenge75Days;

import java.util.HashMap;
import java.util.Map;

public class Day3 {

    public void goodPair(int [] num)
    {   long start= System.currentTimeMillis();
        int len= num.length;
        int cnt =0;

        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++) {
                if (num[i] == num[j]  && i< j ) {
                    cnt++;
                    System.out.println("Good pair: (" + num[i] + ", " + num[j] + ")");
                }
            }
        }
        long end= System.currentTimeMillis();
        System.out.println("Total no of good pair :"+cnt);
        System.out.println("execution time : "+(end - start)+" ms");
    }

    public static void goodPair2(int[] num)
    {
        long start= System.currentTimeMillis();
        Map<Integer, Integer> freq= new HashMap<>();
        int cnt =0;
        for(int i:num){
            if(freq.containsKey(i))
            {
                cnt +=freq.get(i);
            }
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        long end= System.currentTimeMillis();
        System.out.println("Total good  pairs : "+cnt);
        System.out.println("execution time : "+(end - start)+"ms");
    }

    public static void main(String[] args) {
        int[] num ={1,2,4,1,4,4,5,7,3,6};
        Day3 d = new Day3();
        d.goodPair(num);

        goodPair2(num);
    }
}
