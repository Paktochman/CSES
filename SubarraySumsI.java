import java.util.*;

public class SubarraySumsI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        long count = 0, sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += a[right];

            while (sum > x) {
                sum -= a[left++];
            }

            if (sum == x) count++;
        }

        System.out.println(count);
    }
}
