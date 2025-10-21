import java.util.*;

public class WaterFilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int result = 0;
            int emptyCount = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    emptyCount++;
                } else { // blocked cell
                    if (emptyCount > 0) {
                        result += (emptyCount + 2) / 3;
                        emptyCount = 0;
                    }
                }
            }
            
            // handle last segment
            if (emptyCount > 0) {
                result += (emptyCount + 2) / 3;
            }
            
            System.out.println(result);
        }
        sc.close();
    }
}
