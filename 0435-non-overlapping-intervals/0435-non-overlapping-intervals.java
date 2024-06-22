class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<>() {
            public int compare(int l1[],int l2[])
            {
                return Integer.compare(l1[1],l2[1]);
            }});
            int ans=0;
            int next=intervals[0][1];
            for(int i=1;i<intervals.length ;i++)
            {
                if(intervals[i][0]<next)
                ans++;
               else
               { next=intervals[i][1];}
            }
            return ans;
        }
    }
