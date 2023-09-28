class Solution {
    public int findClosestNumber(int[] nums) {
        int k[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            k[i]=Math.abs(nums[i]);
        }
        int s=1000000;
        int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(s>k[i])
            {
                s=k[i];
                ind=i;
            }
            if(s==k[i] && nums[ind]<nums[i])
            {
                ind=i;
            }
        }
        return nums[ind];
    }
}