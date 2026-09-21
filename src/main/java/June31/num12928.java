package June31;

import java.util.ArrayList;
import java.util.List;

public class num12928 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 12;
    int result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int n) {
    int answer = 0;
    List<Integer> numList = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if(n % i == 0) {
        numList.add(i);
      }
    }
    for (int i = 0; i < numList.size(); i++) {
      answer += numList.get(i);
    }
    return answer;
  }
}