package Mar10;

import java.util.Scanner;

public class problem1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 단어의 개수 입력
        int num = sc.nextInt();
        int count = 0;

        // 단어 개수만큼 단어를 입력받음
        for (int i = 0; i < num; i++) {
            String word = sc.next();
            if(isGroupWord(word)) {
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean isGroupWord(String str) {
        boolean[] check = new boolean[26];
        int prev = -1;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if(prev != now) {
                if(check[now - 'a']) {
                    return false;
                }
                check[now - 'a'] = true;
                prev = now;
            }
        }
        return true;
    }
}
