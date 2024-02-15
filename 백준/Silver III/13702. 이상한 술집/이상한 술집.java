import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 주전자의 수
        int K = sc.nextInt(); // 친구의 수
        long[] arr = new long[N]; // 주전자의 용량을 저장하는 배열

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong(); // long으로 수정
        }

        long low = 0, high = Long.MAX_VALUE; // 최대값으로 초기화

        while (low <= high) {
            long mid = (low + high) / 2;
            long total = 0;

            for (long capacity : arr) {
                total += capacity / mid;
            }

            if (total >= K) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(high);
    }
}
