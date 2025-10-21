import java.util.Arrays;
import java.util.Scanner;

public class EqualSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] sticks = new long[n];
        for (int i = 0; i < n; i++) {
            sticks[i] = sc.nextLong();
        }
        sc.close();

        // Sort sticks to find the median
        Arrays.sort(sticks);
        long median = sticks[n / 2]; // For even n, any value between two middle elements works

        // Calculate total cost
        long totalCost = 0;
        for (long stick : sticks) {
            totalCost += Math.abs(stick - median);
        }

        System.out.println(totalCost);
    }
}
