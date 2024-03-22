import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] count = new int[26];
        String s = sc.next();

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(s.indexOf(i) + " ");
        }
    }
}
