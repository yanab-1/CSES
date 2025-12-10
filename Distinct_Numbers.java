import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Distinct_Numbers {
static void sortingBasedApproach() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int count = 1; 
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(sc.nextInt());
        }

        System.out.println(st.size());
    }
}
