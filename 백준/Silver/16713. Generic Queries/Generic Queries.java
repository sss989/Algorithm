import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1]; // 입력 저장 배열
        int[] acc = new int[N + 1]; // 누적 XOR 저장 배열

        int result = 0;

        for (int i = 1; i <= N; i++)
            arr[i] = sc.nextInt();
        // 누적 XOR 계산 -> 저장
        for (int i = 1; i <= N; i++)
            acc[i] = acc[i - 1] ^ arr[i];

        while (M-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            //구간 [i,j]에 대한 누적 XOR을 result에 누적저장
            result ^= acc[j] ^ acc[i - 1];
        }
        System.out.println(result);

    }
}