class Solution {
    public int findNumberOfLIS(int[] nums) {
        int max_length = 1;
        int[] lengths = new int[nums.length];
        int[] counts = new int[nums.length];
        int total_counts = 0;
        
        Arrays.fill(lengths, 1);
        Arrays.fill(counts, 1);
        
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    if(lengths[j] + 1 > lengths[i]){
                        lengths[i] = lengths[j] + 1;
                        counts[i] = counts[j];
                    }
                    else if(lengths[j] + 1 == lengths[i]){
                        counts[i] += counts[j];
                    }
                }
            }
            max_length = Math.max(max_length, lengths[i]);
        }
        for(int k = 0; k < nums.length; k++){
            if(lengths[k] == max_length){
                total_counts += counts[k];
            }
        }
        return total_counts;
    }
}