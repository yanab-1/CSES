import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Inverse_Inversions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        
        int[] arr = new int[n];
        int stVal = 1;
        int endVal = n;
        
        for (int i = 0; i < n; i++) {
            if (k >= n - i - 1) {
                k -= n - i - 1;
                arr[i] = endVal--;
            } else {
                arr[i] = stVal++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
