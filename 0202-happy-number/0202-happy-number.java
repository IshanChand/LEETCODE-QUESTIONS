class Solution {
    public boolean isHappy(int n) {
        Set<Integer> a=new HashSet<>();
        int s=0;
        if(n==1)
        return true;
        while(n!=1)
        {
            s=0;
            while(n>0)
            {
                s+=Math.pow((n%10),2);
                n/=10;
            }
            if(s==1)
            return true;
            n=s;
            if(a.contains(n))
            break;
            else
            a.add(n);
        }
        return false;
    }
}