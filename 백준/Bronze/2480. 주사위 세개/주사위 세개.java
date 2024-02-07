import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        int[] dice = new int[3];

        for (int i = 0; i < 3; i++) {
            dice[i] = Integer.parseInt(str[i]);
        }

        int prize = calPrize(dice);

        System.out.println(prize);
    }

    private static int calPrize(int[] dice) {
        Arrays.sort(dice); // 주사위 눈을 정렬

        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            return 10000 + dice[0] * 1000;
        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) {
            // 두 눈이 같은 경우 중 하나만 체크
            return 1000 + dice[1] * 100;
        } else {
            return dice[2] * 100;
        }
    }
}
