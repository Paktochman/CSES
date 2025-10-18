import java.util.*;

public class TwoSumCSES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long target = x - arr[i];
            if (map.containsKey(target)) {
                System.out.println((map.get(target) + 1) + " " + (i + 1));
                return;
            }
            map.put(arr[i], i);
        }

        System.out.println("IMPOSSIBLE");
        sc.close();
    }
}
