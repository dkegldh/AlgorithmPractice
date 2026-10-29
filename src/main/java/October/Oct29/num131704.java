// https://school.programmers.co.kr/learn/courses/30/lessons/131704 Lv.2
package October.Oct29;

import java.util.Stack;

public class num131704 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] order = {5, 4, 3, 2, 1};
    int result = sol.solution(order);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int[] order) {
    int count = 0;
    Stack<Integer> stack = new Stack<>();
    stack.add(-1);

    for (int i = 1; i <= order.length; i++) {
      stack.add(i);
      while (count < order.length && stack.peek() == order[count]) {
        stack.pop();
        count++;
      }
    }


    return count;
  }
}