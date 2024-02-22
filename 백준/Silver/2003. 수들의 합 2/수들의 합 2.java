import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int result = 0;
        int index = 0;
        int currentSum = 0;
        for (int i = 0; i < N; i++) {
            while (currentSum < M && index < N)
                currentSum += arr[index++];
            if (currentSum == M)
                result++;
            currentSum -= arr[i];
        }

        System.out.println(result);
    }
}