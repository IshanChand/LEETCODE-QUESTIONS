class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List <Integer>> res=new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(),res);
        return res;
    }
    public void backtrack(int i,int n,int k,List<Integer> curr,List<List <Integer>> res)
    {
        if(curr.size()==k)
        {
        res.add(new ArrayList<>(curr));
        return;
        }
        for(int it=i;it<=n;it++)
        {
            curr.add(it);
            backtrack(it+1,n,k,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}