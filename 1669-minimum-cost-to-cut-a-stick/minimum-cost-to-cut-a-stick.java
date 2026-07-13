class Solution {
    public int minCost(int n, int[] c) {

        Arrays.sort(c);

        int m = c.length;

        int[] cuts = new int[m + 2];

        cuts[0] = 0;

        for (int i = 0; i < m; i++) {
            cuts[i + 1] = c[i];
        }

        cuts[m + 1] = n;

        int[][] dp = new int[m + 2][m + 2];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return fun(1, m, cuts, dp);
    }

    public int fun(int i, int j, int[] cuts, int[][] dp) {

        if (i > j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j; k++) {

            int cost = cuts[j + 1] - cuts[i - 1]
                    + fun(i, k - 1, cuts, dp)
                    + fun(k + 1, j, cuts, dp);

            ans = Math.min(ans, cost);
        }

        return dp[i][j] = ans;
    }
}