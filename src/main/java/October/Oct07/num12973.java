// https://school.programmers.co.kr/learn/courses/30/lessons/12973
package October.Oct07;

import java.util.Stack;

public class num12973 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "cdcd";
    int result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution
{
  public int solution(String s)
  {
    int answer;
    Stack<Character> stack = new Stack<>();
    stack.push('A');
    for (int i = s.length() - 1; i >= 0; i--) {
      if(stack.peek().equals(s.charAt(i))) {
        stack.pop();
      } else {
        stack.push(s.charAt(i));
      }
    }

    if(stack.peek().equals('A')) {
      answer = 1;
    } else {
      answer = 0;
    }

    return answer;
  }
}