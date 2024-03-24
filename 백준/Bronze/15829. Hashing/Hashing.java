import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String str = sc.next();

        long answer = 0; // 정답을 저장할 변수

        for (int i = 0; i < L; i++) {
            char c = str.charAt(i); // 문자열의 현재 위치 문자 가져오기
            int ascii = (int) c - 96; // 현재 문자의 아스키 코드 값 
            answer += (long) ascii * power(31, i); // 현재 문자의 해시 값을 누적
        }

        System.out.println(answer % 1234567891);
    }

    // 거듭제곱 함수
    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
