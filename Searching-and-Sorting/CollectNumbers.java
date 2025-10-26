import java.util.*;
import java.io.*;

public class CollectNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1]; // 1-indexed
        int[] pos = new int[n + 1]; // position of each number

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            pos[arr[i]] = i;
        }

        // Calculate initial number of rounds
        int rounds = 1;
        for (int i = 2; i <= n; i++) {
            if (pos[i] < pos[i - 1]) rounds++;
        }

        StringBuilder sb = new S

