import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<ArrayList<Integer>> tree;
    static int[] visit;

    static int dfs(int node, int count) {
        visit[node] = 1;
        for (int i : tree.get(node)) {
            if (visit[i] == 0) {
                count = dfs(i, count + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            tree = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                tree.add(new ArrayList<>());
            }

            for (int j = 0; j < M; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                tree.get(a).add(b);
                tree.get(b).add(a);
            }

            visit = new int[N + 1];
            visit[1] = 0;
            int result = dfs(1, 0);
            System.out.println(result);
        }
    }
}
