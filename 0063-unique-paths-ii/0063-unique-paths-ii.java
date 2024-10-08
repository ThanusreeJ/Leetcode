class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m+1][n+1];
        Arrays.stream(dp).forEach(i->Arrays.fill(i,-1));
        return solve(0,0,grid,dp);
    }
    static int solve(int i,int j,int[][] grid,int[][] dp){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m || j>=n ) return 0;
        if(grid[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j] =solve(i+1,j,grid,dp)+solve(i,j+1,grid,dp);
    }
}