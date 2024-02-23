import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;

        while (start <= N){
            if (sum == N){
                count++;
                sum += end;
                end++;
            } else if (sum < N) {
                sum += end;
                end++;
            } else {
                sum-= start;
                start++;
            }
        }
        System.out.println(count);
    }
}