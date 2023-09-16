class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=1;
        }
        for(int i=1;i<a.length;i++)
        {
            if(ratings[i]>ratings[i-1])
            a[i]=a[i-1]+1;
        }
        for(int i=a.length-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            a[i]=Math.max(a[i],a[i+1]+1);
        }
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
        }
        return s;
    }
}