package CodingChallenge75Days;

public class Day6 {

    public void buySellStock(int[]stock)
    {
        long start= System.currentTimeMillis();
        int buy=stock[0];
        int sell=0, minDay=0, buyDay=0, sellDay=0;


        for(int i=1;i<stock.length;i++)
        {
            if(stock[i]<buy)
            {
                buy= stock[i];
                minDay=i;
            }
            int profit = stock[i]-buy;
            if(profit>sell)
            {
                sell= profit;
                buyDay=minDay;
                sellDay=i;
            }
        }

        if(sell>0)
        {
            System.out.println("Stock buy Day : "+buyDay + ", price :"+stock[buyDay]);
            System.out.println("Stock buy Day : "+sellDay + ", price :"+stock[sellDay]);
        }
        else {
            System.out.println("You are in Loss!!! :(");
        }
        System.out.println("Total profit : "+sell);
        long end=System.currentTimeMillis();
        System.out.println("execution time : "+(end - start)+" ms");
    }

    public static void main(String[] args) {

        int[] stock = {8,1,3,5,2,7,1,9,11};
        Day6 d= new Day6();
        d.buySellStock(stock);
    }

}
