// https://school.programmers.co.kr/learn/courses/30/lessons/12947
package Sep24;

import java.util.ArrayList;
import java.util.List;

public class num12947 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int x = 12;
    boolean result = sol.solution(x);
    System.out.println(result);
  }
}

class Solution {
  public boolean solution(int x) {
    boolean answer = true;
    int originalNum = x;
    int hab = 0;
    List<Integer> number = new ArrayList<>();
    while (x > 0) {
      int num = x % 10;
      number.add(num);
      x /= 10;
    }
    for (int n : number) {
      hab += n;
    }
    if(originalNum % hab != 0) {
      answer = false;
    }

    return answer;
  }
}