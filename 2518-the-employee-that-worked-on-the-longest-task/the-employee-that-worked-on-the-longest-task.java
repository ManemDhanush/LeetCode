class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int maxLeaveTime = logs[0][1];
        int empId = logs[0][0];
        int currLeaveTime = 0;

        for(int i=0; i<logs.length; i++){
            if(maxLeaveTime <= logs[i][1] - currLeaveTime){
                if(maxLeaveTime == logs[i][1] - currLeaveTime){
                    empId = Math.min(empId, logs[i][0]);
                } else {
                    empId = logs[i][0];
                }
                maxLeaveTime = logs[i][1] - currLeaveTime;
            }
            currLeaveTime = logs[i][1];
        }
        return empId;
    }
}