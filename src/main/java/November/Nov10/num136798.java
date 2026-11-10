// https://school.programmers.co.kr/learn/courses/30/lessons/136798 Lv.1
package November.Nov10;

import java.util.Stack;

public class num136798 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int number = 5;
    int limit = 3;
    int power = 2;
    int result = sol.solution(number, limit, power);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int number, int limit, int power) {
    int answer = 0;
    int[] divisors = new int[number];

    for (int i = 1; i <= number; i++) {
      Stack<Integer> stack = new Stack<>();
      for (int j = 1; j <= i; j++) {
        if(i % j == 0) {
          stack.add(j);
        }
      }
      divisors[i - 1] = stack.size();
    }

    for (int k = 0; k < divisors.length; k++) {
      if(divisors[k] > limit) {
        divisors[k] = power;
      }
    }

    for (int num : divisors) {
      answer += num;
    }

    return answer;
  }
}