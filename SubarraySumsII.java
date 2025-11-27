import java.util.*;
import java.io.*;

public class SubarraySumsII {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());

        long[] a = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        // Map to count prefix sums
        HashMap<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);  // prefix sum before array starts

        long prefix = 0;
        long count = 0;

        for (int i = 0; i < n; i++) {
            prefix += a[i];

            long need = prefix - x;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(prefix, map.getOrDefault(prefix, 0L) + 1);
        }

        System.out.println(count);
    }
}
