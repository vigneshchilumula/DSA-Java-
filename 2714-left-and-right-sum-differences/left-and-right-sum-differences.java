class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length; int sum =0;
        for( int i =0 ; i<n ; i++){
           sum+=nums[i];
        }
        int NewSum = sum;
        int[] arr1 = new int[n];
        for( int i =0 ; i<n ; i++){
            NewSum = NewSum - nums[i];
            arr1[i] = NewSum;
            
        }
            NewSum = sum;
              int[] arr2 = new int[n];
        for( int i = n-1; i>=0 ; i--){
            NewSum = NewSum - nums[i];
            arr2[i] = NewSum;
            
        }
        int[] ans = new int[n];
        for( int i = 0 ; i < n ; i++){
            ans[i] = Math.abs(arr2[i] - arr1[i]);

        }
        return ans;
    }
}