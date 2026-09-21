package Sep21;

import java.util.Arrays;

public class num12954 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int x = -4;
    int n = 2;
    long[] result = sol.solution(x, n);
    System.out.println(Arrays.toString(result));
  }
}

class Solution1 {
  public long[] solution(int x, int n) {
    long[] answer = new long[n];
    for (int i = 0; i < n; i++) {
      answer[i] = (long) (i + 1) * x;
    }
    return answer;
  }
}