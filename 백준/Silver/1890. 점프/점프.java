import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] map = new int[N][N];
        long[][] dp = new long[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0 && dp[i][j] != 0) {
                    if (i + map[i][j] < N) {
                        dp[i + map[i][j]][j] += dp[i][j];
                    }
                    if (j + map[i][j] < N) {
                        dp[i][j + map[i][j]] += dp[i][j];
                    }
                }
            }
        }
        System.out.println(dp[N - 1][N - 1]);
    }
}