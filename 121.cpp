// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        // start from the left and make right left + 1
        int l = 0;
        int r = 1;
        int maxProfit = 0;

        // loop till right < length of the prices
        while (r < prices.size()) {
            // if prices of left is less than right then calculate profit and check for maxProfit
            if (prices[l] < prices[r]) {
                maxProfit = max(maxProfit, prices[r] - prices[l]);
            } else {
            // change left to right as we found new minimum
                l = r;
            }
            // increment right everytime
            r++;
        }

        return maxProfit;
    }
};