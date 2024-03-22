import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 1;
        int room = 1;

        while (N > room) {
            room += 6 * count;
            count++;
        }
        System.out.println(count);
    }
}
