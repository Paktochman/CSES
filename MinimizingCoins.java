import java.util.*;

public class MinimizingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) coins[i] = sc.nextInt();

        int[] dp = new int[x + 1];
        Arrays.fill(dp, (int)1e9);
        dp[0] = 0;

        for (int i = 1; i <= x; i++) {
            for (int coin : coins) {
                if (i - coin >= 0)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        System.out.println(dp[x] == 1e9 ? -1 : dp[x]);
    }
}
