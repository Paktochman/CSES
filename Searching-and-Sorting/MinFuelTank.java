import java.util.*;

public class MinFuelTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // number of gas stations
            int x = sc.nextInt(); // destination point
            int[] stations = new int[n];
            
            for (int i = 0; i < n; i++) {
                stations[i] = sc.nextInt();
            }
            
            // Add start and end points to simplify calculations
            int[] points = new int[n + 2];
            points[0] = 0;
            for (int i = 0; i < n; i++) {
                points[i + 1] = stations[i];
            }
            points[n + 1] = x;
            
            int maxDistance = 0;
            
            // Find maximum distance between consecutive points
            for (int i = 1; i < points.length; i++) {
                maxDistance = Math.max(maxDistance, points[i] - points[i - 1]);
            }
            
            // Also consider "skipping" a station to minimize tank usage
            // i.e., max of min(distance between two consecutive points, distance between two points with one skipped)
            for (int i = 1; i < points.length - 1; i++) {
                int skipDistance = points[i + 1] - points[i - 1];
                maxDistance = Math.max(maxDistance, (skipDistance + 1) / 2);
            }
            
            System.out.println(maxDistance);
        }
        sc.close();
    }
}
