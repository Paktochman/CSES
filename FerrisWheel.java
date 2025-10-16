import java.util.*;
public class FerrisWheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        Arrays.sort(weights);
        int i = 0, j = n - 1;
        int gondolas = 0;

        while (i <= j) {
            if (weights[i] + weights[j] <= x) {
                i++; // pair lightest with heaviest
            }
            j--; // heaviest always goes
            gondolas++;
        }

        System.out.println(gondolas);
    }
}
