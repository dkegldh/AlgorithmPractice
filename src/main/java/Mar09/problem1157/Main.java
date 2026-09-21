package Mar09.problem1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if(!input.hasNext()) return;

        String s = input.next().toUpperCase();
        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';

        for (int j = 0; j < 26; j++) {
            if(counts[j] > max) {
                max = counts[j];
                result = (char) (j + 'A');
            } else if(counts[j] == max) {
                result = '?';
            }
        }

        System.out.println(result);
        input.close();
    }
}
