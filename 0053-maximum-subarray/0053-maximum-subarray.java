class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int msum=nums[0];
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>msum)
                msum=sum;
            if(sum<0)
            {
                sum=0;
            }
        }
        return msum;
    }
}