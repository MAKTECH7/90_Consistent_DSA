class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int L = 0;
        int R = k - 1;
        int sum = 0;
        int count = 0;
        double avg = 0;

        for(int i =L; i<=R;i++){
            sum += arr[i];
        }

        avg = (double) sum/k;
        if(avg>=threshold){
            count++;
        }

        //Sliding Window
        while(R<arr.length-1){
            sum = sum - arr[L] + arr[R+1];
            L++;
            R++;
            avg = (double) sum/k;
            if(avg>=threshold){
                count++;
            }
        }

        return count;
    }
}
