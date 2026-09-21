package Mar23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> resList = new ArrayList<>();

        while(true) {
            String input = sc.nextLine();
            if (input.equals("0 0 0")) {
                break;
            }

            String[] num = input.split(" ");
            int[] nums = new int[3];
            nums[0] = Integer.parseInt(num[0]);
            nums[1] = Integer.parseInt(num[1]);
            nums[2] = Integer.parseInt(num[2]);

            java.util.Arrays.sort(nums);

            int powNum1 = nums[0] * nums[0];
            int powNum2 = nums[1] * nums[1];
            int powNum3 = nums[2] * nums[2];

            if (powNum1 + powNum2 == powNum3) {
                resList.add("right");
            } else {
                resList.add("wrong");
            }
        }
        for (String res : resList) {
            System.out.println(res);
        }
    }
}

