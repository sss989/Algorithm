import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= N; i++) {
            StringBuilder result = new StringBuilder();

            result.append("Case #").append(i).append(": ");

            String[] word = sc.nextLine().split(" ");

            for (int j = word.length - 1; j >= 0; j--) {
                result.append(word[j]);
                if (j > 0) {
                    result.append(" ");
                }
            }
            System.out.println(result);
        }

    }
}
