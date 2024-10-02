class Solution {
    public boolean canArrange(int[] arr, int k) {
        int freq[]=new int[k];
        for(int num:arr)
        {
            int rem=num%k;
            if(rem<0)
            {
                rem+=k;
            }
            freq[rem]++;
        }
        if(freq[0]%2!=0)
        return false;
        for(int j=1;j<k;j++)
        {
            if(freq[j]!=freq[k-j])
            return false;
        }
        return true;
    }
}