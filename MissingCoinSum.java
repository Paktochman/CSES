import java.util.Arrays;
import java.util.Scanner;

public class MissingCoinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] coins = new long[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextLong();
        }
        sc.close();

        Arrays.sort(coins);

        long smallestMissing = 1; // Start with 1, smallest possible sum we can't make

        for (long coin : coins) {
            if (coin > smallestMissing) {
                break; // Can't create smallestMissing
            }
            smallestMissing += coin;
        }

        System.out.println(smallestMissing);
    }
}

