class Solution {
    public int maxProfit(int[] prices) {
        int price=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            int day=0;
           if(prices[i]<price)
           {
               price=prices[i];
           }
            day=prices[i]-price;
            profit=Math.max(profit,day);
        }
        return profit;
    }
}
