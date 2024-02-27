import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 듣도 못한 사람 명단을 저장할 배열 a
        String[] a = new String[N];
        for (int i = 0; i < N; i++)
            a[i] = sc.next();
        
        Arrays.sort(a);

        // 듣보잡 명단 저장할 리스트
        List<String> resultList = new ArrayList<>();


        for (int i = 0; i < M; i++) {
            String b = sc.next(); 
            // 이분 탐색을 이용하여 a에 있는지 확인 후 참이면 리스트에 b추가
            if (Arrays.binarySearch(a, b) >= 0)
                resultList.add(b);
        }

        // 결과 명단을 사전순으로 정렬
        resultList.sort(Comparator.naturalOrder());
        
        System.out.println(resultList.size());
        resultList.forEach(System.out::println);
    }
}
