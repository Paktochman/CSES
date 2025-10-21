import java.util.Scanner;

public class CollectingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pos = new int[n + 1]; // pos[i] stores the position of number i in the array

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            pos[num] = i;
        }
        sc.close();

        int rounds = 1; // At least one round is needed
        for (int i = 2; i <= n; i++) {
            if (pos[i] < pos[i - 1]) {
                rounds++;
            }
        }

        System.out.println(rounds);
    }
}

