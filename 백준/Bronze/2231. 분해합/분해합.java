import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 자릿수를 고려하여 시작 값 설정
        int start = Math.max(1, N - 54); // N의 최대 자릿수가 7자리이므로 최대 가능한 생성자는 63입니다.

        for (int i = start; i < N; i++) {
            int sum = i;
            int num = i;

            // 각 자릿수의 합 구하기
            while (num > 0){
                sum += num % 10;
                num /= 10;
            }

            // 생성자인지 확인
            if (sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
