import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            if (str.equals("0")) break;

            int len = str.length();
            boolean result= true;
            for (int i = 0; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(len - i - 1)) {
                    result = false;
                    break;
                }
            }

            System.out.println(result ? "yes" : "no");
        }
    }
}
