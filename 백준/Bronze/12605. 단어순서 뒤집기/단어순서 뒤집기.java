import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= N; i++) {
            Stack<String> stack = new Stack<>();

            System.out.print("Case #" + i + ": ");

            String[] word = sc.nextLine().split(" ");

            for (String w : word) {
                stack.push(w);
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
                if (!stack.isEmpty()) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
