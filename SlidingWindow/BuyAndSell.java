public class BuyAndSell {
    /*You are given an array prices where prices[i] is the given stock on the ith day
    You want to maximize your profit by choosing a single day to buy one stock and choosing
    a different day in the future to sell that stock. Return the maximum profit you can
    achieve from this transaction. If you cannot achieve profit return 0;
    */
    public static int maxProfit(int[] prices){
        int max = 1;
        int min = 0;
        int profit = 0;
        while(max < prices.length){
            if(prices[min] < prices[max]){
                 profit = prices[max] - prices[min];
                 max++;
            } else {
                min = max;
                max++;
            }
       }
    }

    public static void main (String [] args){
        int[] prices1 =  {2,5,3,7,9};
        System.out.println(maxProfit(prices1));

    }
}

