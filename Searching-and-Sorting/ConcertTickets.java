import java.util.*;
public class ConcertTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Read ticket prices
        TreeMap<Integer, Integer> tickets = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            tickets.put(price, tickets.getOrDefault(price, 0) + 1);
        }

        // Process customers
        for (int i = 0; i < m; i++) {
            int maxPrice = sc.nextInt();
            Integer ticketPrice = tickets.floorKey(maxPrice);

            if (ticketPrice == null) {
                System.out.println(-1);
            } else {
                System.out.println(ticketPrice);
                // Decrease count or remove ticket if last one
                if (tickets.get(ticketPrice) == 1) {
                    tickets.remove(ticketPrice);
                } else {
                    tickets.put(ticketPrice, tickets.get(ticketPrice) - 1);
                }
            }
        }
    }
}

