import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // N까지의 티셔츠 번호 큐에 추가
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            q.offer(i);

        int t = 1;
        // 큐에 한명 남을 때까지 계속 반복
        while (q.size() > 1) {
            // 현재 단계t에서 제외될 참가자 인덱스 계산
            long index = (long) Math.pow(t, 3) - 1;
            index %= (q.size());

            // 인덱스만큼 참가자 시계방향으로 이동
            while (index-- > 0) {
                q.offer(q.poll());
            }
            q.poll(); // 제외될 참가자 큐에서 제거
            t++; //다음단계
        }
        System.out.println(q.poll());
    }
}
