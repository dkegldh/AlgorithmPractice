// https://school.programmers.co.kr/learn/courses/30/lessons/133499 Lv.1
package November.Nov17;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class num133499 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    int result = sol.solution(babbling);
    System.out.println(result);
  }
}

class Solution {
  public int solution(String[] babbling) {
    int answer = 0;
    String[] pronunciation = {"aya", "ye", "woo", "ma"};
    List<String> list = Arrays.asList(pronunciation);
    boolean check = true;

    for (String bab : babbling) {
      int n = 0;
      Stack<String> stack = new Stack<>();
      stack.add("A");
      for (int i = 1; i <= bab.length(); i++) {
        String s = bab.substring(n, i);
        if(list.contains(s) && !stack.peek().equals(s)) {
          n = i;
          stack.add(s);
          check = true;
        } else {
          check = false;
        }
      }
      if(check) {
        answer++;
      }
    }

    return answer;
  }
}