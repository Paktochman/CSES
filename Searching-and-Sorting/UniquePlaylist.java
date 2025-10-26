import java.util.*;
public class UniquePlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] songs = new long[n];
        for (int i = 0; i < n; i++) {
            songs[i] = sc.nextLong();
        }

        Set<Long> set = new HashSet<>();
        int maxLen = 0, left = 0;

        for (int right = 0; right < n; right++) {
            while (set.contains(songs[right])) {
                set.remove(songs[left]);
                left++;
            }
            set.add(songs[right]);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}
