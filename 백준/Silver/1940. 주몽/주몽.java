import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr); // 배열을 오름차순으로 정렬

        int start = 0;
        int end = N - 1;
        int count = 0;

        while (start < end) {
            int currentSum = arr[start] + arr[end];

            if (currentSum == M) {
                count++;
                start++;
                end--;
            } else if (currentSum < M) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(count);
    }
}
