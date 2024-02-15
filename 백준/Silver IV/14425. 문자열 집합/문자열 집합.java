import java.util.Arrays;
import java.util.Scanner;

class Main
{
    // 이분 탐색으로 x의 존재 여부 확인
    static boolean isExist(String[] arr, String x) {
        int l = 0, h = arr.length - 1; 
        while (l <= h) {
            int m = (l + h) / 2;
            int compareResult = arr[m].compareTo(x);
            if (compareResult < 0) 
                l = m + 1;
            else if (compareResult > 0) 
                h = m - 1;
            else 
                return true; // 배열에서 x를 찾았을 때 true 반환
        }
        return false; // 찾지 못했을 때 false 반환
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열의 크기 입력
        int M = sc.nextInt(); // 검색할 문자열의 개수 입력
        String[] arr = new String[N];
        
   
        for (int i = 0; i < N; i++)
            arr[i] = sc.next();

        Arrays.sort(arr); // 오름차순으로 정렬

        int count = 0;

        // M번 반복하면서 존재 여부를 확인 -> 결과 count에 누적
        while (M-- > 0) {
            String x = sc.next();
            if (isExist(arr, x))
                count++; // 배열에서 x를 찾았을 때 count 증가
        }

        System.out.println(count); // 결과 출력
    }
}
