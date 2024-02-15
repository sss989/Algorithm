import java.util.Scanner;

class Main
{
    // x의 정수 제곱근을 계산
    static long calcSqrtInteger(long x) {
        if (x == 0) return 0; // 입력이 0일 경우 0을 반환

        long l = 1, h = 1L << 32, sqrt = -1; // 이분 탐색을 위한 변수 초기화
        while (l <= h) {
            long m = (h + l) / 2; // 중간값 계산
            if (m >= (x - 1) / m + 1) {
                h = m - 1; // 조건을 만족할 경우 h을 갱신하고 sqrt를 업데이트
                sqrt = m;
            } else {
                l = m + 1; // 조건을 만족하지 않을 경우 l을 갱신
            }
        }
        return sqrt; // 최종적으로 계산된 정수 제곱근 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong(); 
        System.out.println(calcSqrtInteger(N)); // calcSqrtInteger 함수를 호출하여 정수 제곱근 출력
    }
}
