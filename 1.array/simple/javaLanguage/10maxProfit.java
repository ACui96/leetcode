package javaLanguage;



/**
 * 121. 买卖股票的最佳时机
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。

注意：你不能在买入股票前卖出股票。

 

示例 1:

输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
示例 2:

输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
class Solution10 {
    //暴力法
    public static int maxProfitSolution(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length-1; i++) {

            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;

    }
//一次遍历
    public static int maxProfitSolution1(int[] prices) {
        
        int min_price = Integer.MAX_VALUE;//记录价格最小值
        int max_profit = 0;//最大利润

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < min_price)
                min_price = prices[i];
            
            else if(prices[i] - min_price > max_profit)
                max_profit = prices[i] - min_price;
            
            
        }
        
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        int[] prices2 = { 2,5,1,3};
        System.out.println(maxProfitSolution(prices1));
        System.out.println(maxProfitSolution1(prices2));
}
}
