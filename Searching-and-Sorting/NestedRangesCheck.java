import java.util.*;

public class NestedRangesCheck {
    static class Range {
        int x, y, idx;
        Range(int x, int y, int idx) { this.x = x; this.y = y; this.idx = idx; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Range[] arr = new Range[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            arr[i] = new Range(x, y, i);
        }

        Arrays.sort(arr, (a, b) -> a.x == b.x ? b.y - a.y : a.x - b.x);

        boolean[] contains = new boolean[n];
        boolean[] contained = new boolean[n];
        int maxY = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i].y >= maxY) maxY = arr[i].y;
            else contained[arr[i].idx] = true;
        }

        int minY = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i].y <= minY) minY = arr[i].y;
            else contains[arr[i].idx] = true;
        }

        for (boolean b : contains) System.out.print((b ? 1 : 0) + " ");
        System.out.println();
        for (boolean b : contained) System.out.print((b ? 1 : 0) + " ");
    }
}
