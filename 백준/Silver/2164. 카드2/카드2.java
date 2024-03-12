import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // N까지 큐에 추가
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            q.offer(i);

        while (q.size() > 1){
            q.poll(); // 제일 위 카드 버림

            // 그 다음카드 맨 아래로 옮김
            int move = q.poll();
            q.offer(move);
        }
        System.out.println(q.poll()); // 남은카드 출력
    }
}