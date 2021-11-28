package week269;

class Solution3 {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int maxid=0 ;
        int minid=0 ;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                maxid=i;
            }
            if(min>nums[i]){
                min=nums[i];
                minid=i;
            }

        }

        return Math.min(Math.max(min, max) + 1, nums.length - Math.max(Math.min(min, max), Math.abs(min - max) - 1));
    }
}