import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Integer[] numA = new Integer[N];
        Integer[] numB = new Integer[N];
        
        for (int i = 0; i < N; i++) {
            numA[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            numB[i] = sc.nextInt();
        }
        
        Arrays.sort(numA, Collections.reverseOrder());
        
        Arrays.sort(numB);
        
        int S = 0;
        for (int i = 0; i < N; i++) {
            S = S + numA[i] * numB[i];
        }
        
        System.out.println(S);
    }
}
