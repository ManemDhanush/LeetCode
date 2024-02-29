// https://leetcode.com/problems/koko-eating-bananas/

class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int start = 1;
        int end = *max_element(piles.begin(), piles.end());
        int ans = -1;

        while (start <= end) {
            // To avoid integer overflow
            int mid = start + (end - start) / 2; 
            double count = 0;
            
            for (int i : piles) {
                // Calculate hours needed for each pile
                count += static_cast<int>(ceil(static_cast<double>(i) / mid)); 
            }
            
            if (count <= h) {
                // If the current eating speed is less than ans or initial condition
                if (ans == -1 || mid < ans) {
                    ans = mid;
                }
                // Search for smaller eating speeds
                end = mid - 1; 
            } else {
                // Search for larger eating speeds
                start = mid + 1; 
            }
        }

        int x = ans;

        return x;
    }
};