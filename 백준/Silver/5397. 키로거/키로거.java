import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            String input = scanner.next();
            String result = findPw(input);  // findPw 함수로 비밀번호를 계산
            System.out.println(result);
        }
    }

    // 주어진 키를 처리하여 비밀번호를 찾는 함수
    private static String findPw(String input) {
        LinkedList<Character> password = new LinkedList<>();  // 비밀번호를 저장하는 리스트
        int cursor = 0;  // 커서의 위치를 나타내는 변수

        for (char key : input.toCharArray()) {
            if (key == '<') {
                // 커서를 왼쪽으로 이동 (커서 위치가 0보다 클 때만)
                if (cursor > 0) {
                    cursor--;
                }
            } else if (key == '>') {
                // 커서를 오른쪽으로 이동 (커서 위치가 리스트 크기보다 작을 때만)
                if (cursor < password.size()) {
                    cursor++;
                }
            } else if (key == '-') {
                // 백스페이스: 커서가 0보다 클 때, 왼쪽에 있는 문자를 삭제하고 커서를 왼쪽으로 이동
                if (cursor > 0) {
                    password.remove(cursor - 1);
                    cursor--;
                }
            } else {
                // 그 외의 문자: 현재 커서 위치에 문자를 추가하고, 커서를 오른쪽으로 이동
                password.add(cursor, key);
                cursor++;
            }
        }

        // 비밀번호를 문자열로 변환하여 반환
        StringBuilder result = new StringBuilder();
        for (char c : password) {
            result.append(c);
        }

        return result.toString();
    }
}