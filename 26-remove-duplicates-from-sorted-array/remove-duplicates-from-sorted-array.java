class Solution {
    public static int removeDuplicates(int[] nums) {
       int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }

        }
        return i+1;
    }
    public static void main(String[]args){
        int[] nums={5,5,2,2,4,4,6,6};
        System.out.println(removeDuplicates(nums));
    }
}