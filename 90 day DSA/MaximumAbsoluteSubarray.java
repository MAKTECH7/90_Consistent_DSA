class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = findMaximumSubarray(nums);
        int minSum = findMinimumSubarray(nums);
        int absSum = Math.abs(minSum);

        return Math.max(maxSum,absSum);

    }
    private int findMaximumSubarray(int[] nums){
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;

            for(int i=0;i<nums.length; i++){
                currentSum += nums[i];
                maxSum = Math.max(maxSum, currentSum);
                if(currentSum<0){
                    currentSum = 0;
                }
            }

            return maxSum;
        }

        private int findMinimumSubarray(int[] nums){
            int currentSum = 0;
            int minSum = Integer.MAX_VALUE;

            for(int i=0;i<nums.length; i++){
                currentSum += nums[i];
                minSum = Math.min(minSum, currentSum);
                if(currentSum>0){
                    currentSum = 0;
                }
            }

            return minSum;
        }
}
