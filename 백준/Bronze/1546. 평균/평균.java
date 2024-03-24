import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = 0;
        float avg = 0;

        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            if (max < score[i]) {
                max = score[i];
            }
        }

        for (int i = 0; i < N; i++) {
            avg += (float) score[i] / max * 100;
        }

        System.out.printf("%.2f\n", avg / N);
    }
}
