package CodingChallenge75Days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day7 {

    public void reverseString(String str)
    {
        long start = System.currentTimeMillis();
        String[] words= str.trim().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }

        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("execution time "+(end-start)+" ms");
    }

    public void reverseString2(String s)
    {
        long start = System.currentTimeMillis();
        List<String> list= new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        Collections.reverse(list);
        System.out.println(list);
        long end = System.currentTimeMillis();
        System.out.println("execution time "+(end-start)+" ms");

    }


    public static void main(String[] args) {
        String str= "The Perfect Picture";
        Day7 d= new Day7();
        d.reverseString(str);
        d.reverseString2(str);
    }
}
