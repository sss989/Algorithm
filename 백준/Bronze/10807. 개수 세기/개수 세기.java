import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();

        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        int V = sc.nextInt();

        for (int j = 0; j < num.length; j++) {
            if(V == num[j])
                count++;
        }
        System.out.println(count);
    }
}
