class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int currentLength = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                currentLength += 1;
            }
            else {
                if(currentLength > maxLength){
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }

        if(currentLength > maxLength){
            maxLength = currentLength;
        }

        return maxLength;
    }
}
