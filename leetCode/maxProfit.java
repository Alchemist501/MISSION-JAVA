//Problem Description := https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description
class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int begin = prices[0];
        int len = prices.length;
        for (int i = 1; i < len ; i++) {
            if (begin < prices[i]) profit += prices[i] - begin;    
            begin = prices[i];
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}