import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] unheard = new String[N];
        for (int i = 0; i < N; i++)
            unheard[i] = sc.next();
        Arrays.sort(unheard);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = sc.next();
            if (Arrays.binarySearch(unheard, name) >= 0)
                result.add(name);
        }

        result.sort(Comparator.naturalOrder());
        System.out.println(result.size());
        result.forEach(System.out::println);
    }
}
