import java.util.*;

public class FactoryMachines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long[] k = new long[n];
        for (int i = 0; i < n; i++) k[i] = sc.nextLong();

        long low = 1, high = (long)1e18, ans = high;
        while (low <= high) {
            long mid = (low + high) / 2;
            long total = 0;
            for (long time : k) {
                total += mid / time;
                if (total >= t) break;
            }
            if (total >= t) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        System.out.println(ans);
    }
}
