class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<=1){
            return 0;
        }
        int maxProfit=0;
        int minPrice=prices[0];
                for(int i=1;i <n;i++){
                minPrice=Math.min(minPrice, prices[i]);
                int currentProfit=prices[i]-minPrice;
                maxProfit=Math.max(maxProfit, currentProfit);
        }
return maxProfit;
    }
}
