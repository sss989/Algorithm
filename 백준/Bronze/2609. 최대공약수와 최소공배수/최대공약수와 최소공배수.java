import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = findGcd(a, b);
        int lcm = findLcm(a, b);

        System.out.println(gcd);
        System.out.println(lcm);
    }


    public static int findGcd(int a, int b) {
        while ( b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return  a;
    }

    public static int findLcm(int a, int b) {
        return a * b / findGcd(a, b);
    }
}
