class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num:nums1){
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }

        // int[] ans = new int[nums1.length];
        // int k =0;
        // for(int num:nums2){
        //     int count = map.getOrDefault(num,0);
        //     if(count==0){
        //         continue;
        //     }else{
        //         ans[k] = num;
        //         k++;
        //         map.put(num,count-1);
        //     }
        // }

        // return Arrays.copyOfRange(ans,0,k);
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] ans = new int[nums1.length];
        int k =0;
        int i =0;
        int j =0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans[k] = nums1[i];
                i++;
                j++;
                k++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }

        }
        return Arrays.copyOfRange(ans,0,k);
    }
}