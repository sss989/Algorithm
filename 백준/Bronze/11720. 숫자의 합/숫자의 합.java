import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String num = sc.next();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += num.charAt(i)-'0'; // 정수로 변환해서 합계산

        }
        System.out.println(sum);
    }
}
