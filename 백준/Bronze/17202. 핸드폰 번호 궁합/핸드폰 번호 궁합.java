import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int[] aList = new int[8];
        int[] bList = new int[8];
        for (int i = 0; i < 8; i++) {
            aList[i] = Character.getNumericValue(a.charAt(i));
            bList[i] = Character.getNumericValue(b.charAt(i));
        }

        int[] dp = new int[16];
        for (int i = 0; i < 8; i++) {
            dp[2 * i] = aList[i];
            dp[2 * i + 1] = bList[i];
        }


        while (dp.length > 2) {
            int[] tempDp = new int[dp.length - 1];
            for (int i = 0; i < dp.length - 1; i++) {
                tempDp[i] = (dp[i] + dp[i + 1]) % 10;
            }
            dp = tempDp;
        }

        System.out.printf("%02d", Integer.parseInt(dp[0] + "" + dp[1]));
    }
}
