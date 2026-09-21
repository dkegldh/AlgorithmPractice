package Mar24;

import java.util.Scanner;

public class Decimal {
    public static boolean getPrime(int n) {
        if(n == 1) {
            return false;
        }

        for (int j = 2; j < n; j++) {
            if(n % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int inputNum = sc.nextInt();
        for (int i = 0; i < inputNum; i++) {
            int num = sc.nextInt();
            boolean result = getPrime(num);
            if(result) {
                count++;
            }
        }
        System.out.println(count);
    }
}
