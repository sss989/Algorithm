import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 소진

        for (int i = 0; i < T; i++) {
            String ox = sc.nextLine();
            int score = 0;
            int countO = 0;

            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    countO++;
                    score += countO;
                } else {
                    countO = 0;
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}
