import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();
        int last = -1;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("push")) {
                last = Integer.parseInt(st.nextToken());
                q.offer(last);
            } else if (cmd.equals("pop")) {
                System.out.println(q.isEmpty() ? "-1" : q.poll());
            } else if (cmd.equals("size")) {
                System.out.println(q.size());
            } else if (cmd.equals("empty")) {
                System.out.println(q.isEmpty() ? "1" : "0");
            } else if (cmd.equals("front")) {
                System.out.println(q.isEmpty() ? "-1" : q.peek());
            } else if (cmd.equals("back")) {
                System.out.println(q.isEmpty() ? "-1" : last);
            }

        }

        br.close();
    }
}
