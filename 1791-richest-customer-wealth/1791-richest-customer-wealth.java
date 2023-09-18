class Solution {
    public int maximumWealth(int[][] accounts) {
        int g=0;
        int sum=0;for(int i=0;i<accounts.length;i++)
        {
            sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            g=Math.max(g,sum);
        }
        return g;
    }
}