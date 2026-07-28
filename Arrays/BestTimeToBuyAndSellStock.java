/*leetcode 121: best time to but and sell stock
Approach: kadane's algo, Time Complexity: O(n), Space Complexity: O(1)
The best selling day for any position depends on the lowest buying price encountered before it.
Instead of checking every pair of buy and sell days, maintain the minimum price seen so far
and compute the profit in a single traversal. 
While traversing:
Keep track of the minimum price seen so far.
For each day, calculate the profit if you sold today.
Update the maximum profit
Also update the minimum buying price whenever a lower price is encountered.
Return the maximum profit after processing all days.
*/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int cp=prices[0];
        int maxProfit=0;
        for(int i=1; i<prices.length; i++){
            cp=Math.min(cp,prices[i]);
            int profit= prices[i]-cp;
            maxProfit=Math.max(maxProfit, profit);
            
        }
        return maxProfit;
       }
}
