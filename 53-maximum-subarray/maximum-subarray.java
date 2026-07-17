class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int current_sum=0;
        int max_sum= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            current_sum+=nums[i];
            max_sum=Math.max(current_sum,max_sum);
 if(current_sum<0){
    current_sum=0;
 }
        }
 return max_sum;
    }
}