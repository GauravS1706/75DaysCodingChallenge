package CodingChallenge75Days;

public class Day4 {
    public static void pascalTriangle(int num)
    {
        long start= System.currentTimeMillis();
        int i=0,j,k;

        for(;i<num;i++)
        {
            for(k=num;k>i;k--)
            {
                System.out.print("  ");
            }
            int n=1;
            for(j=0;j<=i;j++)
            {
                System.out.printf("%4d", n);
                n = n * (i - j) / (j + 1);
//                System.out.print("n : "+n);
            }
            System.out.println();
        }
        long end =System.currentTimeMillis();
        System.out.println("execution time : "+(end - start)+" ms");
    }

    public static void main(String[] args) {

        pascalTriangle(7);
    }
}
