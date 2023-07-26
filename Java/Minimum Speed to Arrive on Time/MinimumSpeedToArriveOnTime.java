class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        // limit constraints
        int start = 1, end = 10000000;
 
        if(hour <= dist.length - 1){
            return -1;
        }

       while(start < end){
           int mid = start + (end - start ) / 2;
           double time = 0;

            for(int i = 0; i < dist.length; i++){
                if(i != dist.length - 1){
                    time += Math.ceil((double) dist[i] / mid);
                } else {
                    // Last train
                    time += (double) dist[i] / mid;
                }
            }
            if(time > hour){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
    return start;
    }
}