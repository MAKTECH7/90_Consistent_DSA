class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int i = 0;
        int j = height.length - 1;

        int maxArea = 0;

        while(i<j){
            int cheight = Math.min(height[i], height[j]);
            int cWidth = j - i;

            int area = cheight * cWidth;

            maxArea = Math.max(maxArea, area);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }

        return maxArea;
    }
}
