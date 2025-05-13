package CodingChallenge75Days;

public class Day5 {
    public int maxSubArray(int[] arr)
    {
        long start= System.currentTimeMillis();
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(currSum+arr[i]>arr[i])
            {
                currSum += arr[i];
            }
            else {
                currSum=arr[i];
            }
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
        }
        long end =System.currentTimeMillis();
        System.out.println("execution time : "+(end - start)+" ms");
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,2,6,5,7,4};
        Day5 d= new Day5();
        System.out.println(d.maxSubArray(arr));
    }

}
