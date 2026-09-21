package Mar09.problem1157;

import java.util.Scanner;

public class croatiaAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String pattern : croatia) {
            if(input.contains(pattern)) {
                input = input.replace(pattern, "*");
            }
        }

        System.out.println(input.length());
    }
}
