import java.util.*;

public class RestaurantCustomers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] events = new int[2 * n][2]; // [time, type] type: 1=arrival, -1=departure
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            events[2 * i][0] = a;
            events[2 * i][1] = 1;   // arrival
            events[2 * i + 1][0] = b;
            events[2 * i + 1][1] = -1; // leaving
        }

        // Sort by time, if tie then departures (-1) before arrivals (1)
        Arrays.sort(events, (x, y) -> x[0] != y[0] ? x[0] - y[0] : x[1] - y[1]);

        int current = 0;
        int maxCustomers = 0;
        for (int[] event : events) {
            current += event[1];
            maxCustomers = Math.max(maxCustomers, current);
        }

        System.out.println(maxCustomers);
    }
}

