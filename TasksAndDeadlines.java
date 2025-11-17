import java.util.*;

public class TasksAndDeadlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tasks = new int[n][2];  // [duration, deadline]
        
        for (int i = 0; i < n; i++) {
            tasks[i][0] = sc.nextInt();
            tasks[i][1] = sc.nextInt();
        }
        
        Arrays.sort(tasks, Comparator.comparingInt(a -> a[0])); // sort by time
        long currentTime = 0, reward = 0;
        
        for (int[] task : tasks) {
            currentTime += task[0];
            reward += task[1] - currentTime;
        }
        System.out.println(reward);
    }
}
