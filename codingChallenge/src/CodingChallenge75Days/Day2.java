package CodingChallenge75Days;

public class Day2 {
    public void shuffleArray(int [] num)
    {
        int len= num.length;
        int i=0 ,j;

        for( ;i<len;i++){
            for(j=i+1; j<len;j++)
            {
                if(num[i]>num[j])
                {
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }

        for(int e:num){
            System.out.print(e+ " ");
        }
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,1,2,3,4,5};
        Day2 d= new Day2();
        d.shuffleArray(arr);
    }
}
