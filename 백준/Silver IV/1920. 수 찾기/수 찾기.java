import java.util.Arrays;
import java.util.Scanner;

class Main
{   
    // 이분탐색으로 배열에서 x의 존재 여부 확인
    static boolean isExist(int[] arr, int x) {
        int l = 0, h = arr.length - 1; 
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] < x) 
                l = m + 1;
            else if (arr[m] > x) 
                h = m - 1;
            else 
                return true; // x찾았을 시 true 반환
        }
        return false; // 아닐 시 false 반환
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        
        Arrays.sort(arr); // 배열 오름차순 정렬

        int M = sc.nextInt();
        
        // M번 반복하여 숫자 존재 여부 출력
        while (M-- > 0) {
            int x = sc.nextInt();
            boolean ans = isExist(arr, x);
            System.out.println(ans ? 1 : 0);
        }
    }
}
