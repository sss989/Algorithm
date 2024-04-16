import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < N - 1; i++) {
            heap.offer(sc.nextInt());
        }

        int count = 0;
        while (!heap.isEmpty() && heap.peek() >= D) {
            int now = heap.poll();
            count++;
            D++;
            heap.offer(now - 1);
        }

        System.out.println(count);
    }
}
