public class BuyAndSell {
    /*You are given an array prices where prices[i] is the given stock on the ith day
    You want to maximize your profit by choosing a single day to buy one stock and choosing
    a different day in the future to sell that stock. Return the maximum profit you can
    achieve from this transaction. If you cannot achieve profit return 0;
    */
    public static int maxProfit(int[] prices){
        int min = prices[0];
        int maxGreaterThanMin = prices[1];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){

            }
            
        }
    }

    public static void main (String [] args){
        int[] prices1 =  {2,5,3,7,9};
        maxProfit(prices1);

    }
}

