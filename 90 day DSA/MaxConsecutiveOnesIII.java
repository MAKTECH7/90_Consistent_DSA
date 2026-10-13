class Solution {
    public int longestOnes(int[] nums, int k) {
        int L = 0;
        int zeroes = 0;
        int maxLength = 0;
    
        for(int R=0; R<nums.length; R++){
            if(nums[R]==0){
                zeroes++;
            }


            while(zeroes>k){
                if(nums[L]==0){
                    zeroes--;
                }
                L++;
            }
            maxLength = Math.max(maxLength, R-L+1);
        }
        
        return maxLength;
    }
}
