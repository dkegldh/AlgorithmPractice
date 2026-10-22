// https://school.programmers.co.kr/learn/courses/30/lessons/76502 Lv.2
package October.Oct22;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class num76502 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String s = "[](){}";
    int result = sol.solution(s);
    System.out.println(result);
  }
}

class Solution {
  public int solution(String s) {
    int answer = 0;
    Deque<Character> n = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      n.add(s.charAt(i));
    }

    for (int j = 0; j < s.length(); j++) {
      Stack<Character> stack = new Stack<>();
      stack.push('A');
      char a = n.peekFirst();
      boolean confirm = true;
      for (char c : n) {
        char top = stack.peek();
        if(c == '[' || c == '{' || c == '(') {
          stack.push(c);
        }
        if(c == ']') {
          if(top == '[') {
            stack.pop();
          } else {
            confirm = false;
            break;
          }
        } else if(c == '}') {
          if(top ==  '{') {
            stack.pop();
          } else {
            confirm = false;
            break;
          }
        } else if(c == ')') {
          if(top == '(') {
            stack.pop();
          } else {
            confirm = false;
            break;
          }
        }
      }
      if(stack.peek() == 'A' && confirm) {
        answer++;
      }
      n.pop();
      n.addLast(a);
    }

    return answer;
  }
}