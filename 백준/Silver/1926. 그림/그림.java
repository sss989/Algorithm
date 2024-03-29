import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] map;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int BFS(int r, int c) {
        int sum = 1;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(r, c));
        map[r][c] = 0;

        while (!q.isEmpty()) {
            Pair cur = q.peek();
            int x = cur.x;
            int y = cur.y;
            q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && map[nx][ny] == 1) {
                    q.offer(new Pair(nx, ny));
                    map[nx][ny] = 0;
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[501][501];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        int size = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {
                    int tmp = BFS(i, j);
                    size = Math.max(size, tmp);
                    count++;
                }
            }
        }
        System.out.println(count + "\n" + size);
    }

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
