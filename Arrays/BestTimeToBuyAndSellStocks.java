//leetcode 121
class Solution {
    public int maxProfit(int[] prices) {
        //min buying price
        int minPrice=Integer.MAX_VALUE;
        //max profit
        int maxProfit=0;
        //traverse
        for(int i=0;i<prices.length;i++){
            //if currprice smaller update
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            int currentProfit=prices[i]-minPrice;
            //update max profit
            if(currentProfit>maxProfit){
                maxProfit=currentProfit;
            }
        }
        //return max profit
        return maxProfit;

    }
}