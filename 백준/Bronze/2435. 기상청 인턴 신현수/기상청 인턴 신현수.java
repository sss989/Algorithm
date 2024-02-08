import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        // 배열 값 입력
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int[] acc = new int[N + 1];

        // 누적 합 배열 계산
        for (int i = 1; i <= N; i++)
            acc[i] = acc[i - 1] + arr[i - 1];

        int result = Integer.MIN_VALUE;

        // 부분합을 계산하면서 최댓값 갱신
        for (int i = K; i <= N; i++) {
            int currentSum = acc[i] - acc[i - K];
            result = Math.max(result, currentSum);
        }

        System.out.println(result);
    }
}
