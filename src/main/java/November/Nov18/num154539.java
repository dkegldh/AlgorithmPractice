// https://school.programmers.co.kr/learn/courses/30/lessons/154539 Lv.2
package November.Nov18;

import java.util.Arrays;
import java.util.Stack;

public class num154539 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] numbers = {9, 1, 5, 3, 6, 2};
    int[] result = sol.solution(numbers);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int[] numbers) {
    int[] answer = new int[numbers.length];
    Stack<Integer> stack = new Stack<>();
    stack.add(0);
    Arrays.fill(answer, -1);

    for (int i = 1; i < numbers.length; i++) {
      while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
        answer[stack.pop()] = numbers[i];
      }
      stack.add(i);
    }
    return answer;
  }
}