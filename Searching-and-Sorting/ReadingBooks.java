import java.util.*;
 
public class ReadingBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0, maxTime = 0;

        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            sum += t;
            maxTime = Math.max(maxTime, t);
        }
        System.out.println(Math.max(sum, 2 * maxTime));
    }
}
