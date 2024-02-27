// https://leetcode.com/problems/car-fleet/

class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        // crating a vector with the position and the time taken to reach the finish line  
        vector<pair<int, float>> time;
        int ans = 0;
        float max = INT_MIN;

        // actual calculation of the time by dist / speed
        for (int i = 0; i < speed.size(); i++) {
            time.push_back(
                make_pair(position[i],
                          (float)(target - position[i]) / (float)(speed[i])));
        }

        // sorting on basis of the position
        sort(time.begin(), time.end(),
             [](auto& left, auto& right) { return left.first > right.first; });

        for (auto t : time) {
            // if the time taken by the first position > max then we considered as a fleet occured 
            if (t.second > max) {
                max = t.second;
                ans++;
            }
        }
        return ans;
    }
};