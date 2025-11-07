import java.util.*;

public class RoomAllocation {
    static class Customer {
        int start, end, index;
        Customer(int s, int e, int i) {
            start = s; end = e; index = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Customer[] customers = new Customer[n];
        for (int i = 0; i < n; i++)
            customers[i] = new Customer(sc.nextInt(), sc.nextInt(), i);

        Arrays.sort(customers, (a, b) -> a.start - b.start);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int[] room = new int[n];
        int roomCount = 0;

        for (Customer c : customers) {
            if (!pq.isEmpty() && pq.peek()[0] < c.start) {
                int[] curr = pq.poll();
                room[c.index] = curr[1];
                pq.offer(new int[]{c.end, curr[1]});
            } else {
                roomCount++;
                room[c.index] = roomCount;
                pq.offer(new int[]{c.end, roomCount});
            }
        }

        System.out.println(roomCount);
        for (int r : room) System.out.print(r + " ");
    }
}
