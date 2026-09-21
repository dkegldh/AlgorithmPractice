package Mar19;

import java.util.Scanner;

public class ReadDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String line = sc.next();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if(arr[i][j] != '\0') {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
