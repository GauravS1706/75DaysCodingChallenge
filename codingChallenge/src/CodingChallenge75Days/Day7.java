package CodingChallenge75Days;

public class Day7 {

    public void reverseString(String str)
    {
        long start = System.currentTimeMillis();
        for(int i=str.length()-1;i>=0 ;i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("execution time "+(end-start)+" ms");
    }

    public void reverseString2(String s)
    {
        long start = System.currentTimeMillis();
        StringBuilder str= new StringBuilder(s);
        System.out.println(str.reverse());
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
