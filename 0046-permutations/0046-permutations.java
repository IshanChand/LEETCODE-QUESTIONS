class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List <Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res,ArrayList<Integer>templist,int[] nums)
    {
        if(templist.size()==nums.length){
            res.add(new ArrayList<>(templist));
            return;
        }
        for(int number:nums)
        {
            if(templist.contains(number))
            continue;
            templist.add(number);
            backtrack(res,templist,nums);
            templist.remove(templist.size()-1);
        }
    }
}