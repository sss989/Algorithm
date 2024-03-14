import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        while (N-->0){
            char[] word = sc.next().toCharArray();
            char[] stack = new char[word.length];
            int top = -1;

            for(char ch : word){
                if(top<0){
                    stack[++top] = ch;
                }
                else if (stack[top] == ch) {
                    top--;
                }
                else{
                    stack[++top] = ch;
                }
            }
            if (top < 0)
                count++;
        }
        System.out.println(count);
    }
}