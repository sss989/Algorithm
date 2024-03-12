import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }

        for (int i = 1; i <= N - 1; i++) {
            long p = (long) Math.pow(i, 3) - 1;
            p %= (N - i + 1);

            while (p-- > 0) {
                dq.addLast(dq.pollFirst());
            }
            dq.pollFirst();
        }

        System.out.println(dq.peekFirst());
    }
}
