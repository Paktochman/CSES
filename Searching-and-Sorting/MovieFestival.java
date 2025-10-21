package CSES;

import java.util.*;

public class MovieFestival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] movies = new int[n][2];

        for (int i = 0; i < n; i++) {
            movies[i][0] = sc.nextInt(); // start time
            movies[i][1] = sc.nextInt(); // end time
        }

        // Sort movies by ending time
        Arrays.sort(movies, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int lastEnd = 0;

        for (int i = 0; i < n; i++) {
            if (movies[i][0] >= lastEnd) {
                count++;
                lastEnd = movies[i][1];
            }
        }

        System.out.println(count);
        sc.close();
    }
}

