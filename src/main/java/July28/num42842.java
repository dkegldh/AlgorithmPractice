package July28;

import java.util.Arrays;

public class num42842 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int brown = 10;
    int yellow = 2;
    int[] result = sol.solution(brown, yellow);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int brown, int yellow) {
    int[] answer = {};
    int total = brown + yellow;
    for (int width = total; width >= 1; width--) {
      if(total % width != 0) {
        continue;
      }
      int height = total / width;
      if(width >= height && (width - 2) * (height - 2) == yellow) {
        answer = new int[]{width, height};
      }
    }
    return answer;
  }
}