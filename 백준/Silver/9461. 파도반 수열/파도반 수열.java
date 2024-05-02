import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        long[] num = new long[100];
        num[0] = 1;
        num[1] = 1;
        num[2] = 1;

        for (int i = 3; i < 100; i++) {
            num[i] = num[i - 2] + num[i - 3];
        }

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            System.out.println(num[N - 1]);
        }

    }
}
