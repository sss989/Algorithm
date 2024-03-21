import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (n * 2) - 1;
        StringBuilder result = new StringBuilder();
        for (int i = n; i > 0; i--) {
            result.append(printStar(n - i, i));
        }
        for (int i = 2; i <= n; i++) {
            result.append(printStar(n - i, i));
        }
        System.out.println(result);
    }

    public static String printStar(int x, int y) {
        StringBuilder s = new StringBuilder();
        int star = 0;
        for (int i = 0; i < x; i++) {
            star = 1 - star;
            s.append(star == 1 ? "*" : " ");
        }
        for (int i = 0; i < y + y - 1; i++) {
            s.append(x % 2 == 0 ? "*" : " ");
        }
        for (int i = 0; i < x; i++) {
            star = 1 - star;
            s.append(star == 1 ? " " : "*");
        }
        s.append("\n");
        return s.toString();
    }
}
