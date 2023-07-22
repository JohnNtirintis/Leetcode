class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            int[] row = intervals[i];
            if(row[0] < end){
                count++;
            }
            else {
                end = row[1];
            }
        }
        return count;
    }
}