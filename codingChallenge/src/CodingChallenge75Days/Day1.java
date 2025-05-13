package CodingChallenge75Days;


import java.util.Arrays;
import java.util.Scanner;

public class Day1 {

    public int[] concatArray(int [] num){
        int len = num.length;
        int [] ans= new int[len * 2];

        for(int i=0; i<len; i++){
            ans[i]= num[i];
            ans[i+len]= num[i];
        }
        return ans;
    }

    public static void concatArray2(int [] num){
        int len = num.length;
        int [] ans= new int[len * 2];

        for(int i=0; i<len; i++){
            ans[i]= num[i];
            ans[i+len]= num[i];
        }

        System.out.print(Arrays.toString(ans));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len= sc.nextInt();
        int[] num= new int[len];
        System.out.println("Enter Element of Array");
        for(int i=0;i<len;i++){
            num[i]=sc.nextInt();
        }
        Day1 d= new Day1();
        for(int i:d.concatArray(num))
        {
            System.out.print(i+", ");
        }

        System.out.println();
        concatArray2(num);
    }

}