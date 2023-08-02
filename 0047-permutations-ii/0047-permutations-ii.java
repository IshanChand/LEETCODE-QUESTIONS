class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,nums,new ArrayList(),new boolean[nums.length]);
        return res;
    }
    public void backtrack(List<List<Integer>> res,int[] nums,List<Integer> temp,boolean[] f)
    {
        if(temp.size()==nums.length)
        {
            if(!res.contains(temp))
            {
                res.add(new ArrayList(temp));
            }
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(f[i]==true)
            continue;
            f[i]=true;
            temp.add(nums[i]);
            backtrack(res,nums,temp,f);
            f[i]=false;
            temp.remove(temp.size()-1);
        }
    }
}