public class Backpack1 {
    public static int knapsack(int[] weights, int[] values, int W, boolean[][] path) {
        int n = weights.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (j < weights[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                    path[i][j] = false;
                } else {
                    if (dp[i - 1][j] > dp[i - 1][j - weights[i - 1]] + values[i - 1]) {
                        dp[i][j] = dp[i - 1][j];
                        path[i][j] = false;
                    } else {
                        dp[i][j] = dp[i - 1][j - weights[i - 1]] + values[i - 1];
                        path[i][j] = true;
                    }
                }
            }
        }

        return dp[n][W];
    }

    public static void printSelectedItems(int[] weights, int[] values, int W, boolean[][] path) {
        int n = weights.length;
        int j = W;
        System.out.print("选择的物品: ");
        for (int i = n; i > 0; i--) {
            if (path[i][j]) {
                System.out.printf("物品 %d (重量: %d, 价值: %d), ", i , weights[i - 1], values[i - 1]);
                j -= weights[i - 1];
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] weights = {11, 1, 21,23,43,33,55,45};
        int[] values = {21, 11, 31,33,53,43,65,55};
        int W = 110;
        boolean[][] path = new boolean[weights.length + 1][W + 1];

        int maxValue = knapsack(weights, values, W, path);
        System.out.println("最大价值: " + maxValue);
        printSelectedItems(weights, values, W, path);
    }
}
