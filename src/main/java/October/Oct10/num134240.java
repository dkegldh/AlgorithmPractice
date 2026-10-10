// https://school.programmers.co.kr/learn/courses/30/lessons/134240
package October.Oct10;

import java.util.Stack;

public class num134240 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] food = {1, 3, 4, 6};
    String result = sol.solution(food);
    System.out.println(result);
  }
}

class Solution {
  public String solution(int[] food) {
    String answer = "";
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();

    for (int i = 1; i < food.length; i++) {
      if(food[i] > 1) {
        int num = food[i] / 2;
        for (int j = 0;  j < num; j++) {
          sb.append(i);
          stack.push(i);
        }
      }
    }
    sb.append(0);

    while (!stack.isEmpty()) {
      int num = stack.pop();
      sb.append(num);
    }

    answer = sb.toString();
    return answer;
  }
}