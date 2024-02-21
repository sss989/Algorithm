import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]); // a의 수
            int b = Integer.parseInt(input[1]); // b의 수

            int[] arrA = new int[a];
            int[] arrB = new int[b];

            // arrA 배열 입력
            input = reader.readLine().split(" ");
            for (int i = 0; i < a; i++) {
                arrA[i] = Integer.parseInt(input[i]);
            }

            // arrB 배열 입력
            input = reader.readLine().split(" ");
            for (int i = 0; i < b; i++) {
                arrB[i] = Integer.parseInt(input[i]);
            }

            // 정렬
            Arrays.sort(arrA);
            Arrays.sort(arrB);

            int count = 0; // arrA가 arrB보다 큰 쌍의 개수

            // 이분 탐색으로 arrB에서 arrA[i]보다 큰 값의 위치 찾음
            for (int i = 0; i < a; i++) {
                int index = binarySearch(arrB, arrA[i], b);

                // arrA[i]보다 작은 원소 개수 계산 후 count에 저장
                count += index;
            }

            System.out.println(count);
        }

        reader.close();
    }

    // 이분탐색 메소드
    private static int binarySearch(int[] arr, int target, int length) {
        int left = 0;
        int right = length - 1;
        int result = length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // 중앙값이 목표값 이상일 경우, 찾은 인덱스를 result에 저장하고 왼쪽 부분을 계속 탐색
            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
