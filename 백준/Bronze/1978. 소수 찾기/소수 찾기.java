import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num;
        int count = 0;

        for (int i = 0; i < N; i++) {
            num = sc.nextInt();
            boolean isPrime = true; // 현재 숫자가 소수인지를 나타내는 플래그

            // 2부터 num-1까지 모든 수로 나누어보고 소수 여부를 판별
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false; // 나누어 떨어지면 소수가 아님
                    break; // 소수가 아니므로 루프 종료
                }
            }

            // 소수인 경우 count 증가
            if (isPrime && num > 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
