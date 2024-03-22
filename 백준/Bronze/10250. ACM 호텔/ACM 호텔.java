import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; ++i) {
            int H = sc.nextInt();  // 층 수
            int W = sc.nextInt();  // 각 층의 방 수
            int N = sc.nextInt();  // 몇 번째 손님인지

            int X = N / H + 1;  // 호수 계산
            int Y = N % H;      // 층 계산

            // 만약 층 번호가 0이면 맨 꼭대기 층이므로 맨 아래 층으로 변경하고 호수를 1 줄임
            if (Y == 0) {
                Y = H;
                X -= 1;
            }
            System.out.printf("%d%02d\n", Y, X);

        }
    }
}