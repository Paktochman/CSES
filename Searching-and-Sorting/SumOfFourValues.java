import java.util.*;

public class SumOfFourValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        HashMap<Long, int[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                long need = x - (a[i] + a[j]);

                if (map.containsKey(need)) {
                    int[] p = map.get(need);
                    if (p[0] != i && p[0] != j && p[1] != i && p[1] != j) {
                        System.out.println((p[0]+1) + " " + (p[1]+1) + " " + (i+1) + " " + (j+1));
                        return;
                    }
                }
            }

            for (int k = 0; k < i; k++) {
                map.put(a[i] + a[k], new int[]{k, i});
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}
