package April29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Hindex {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] citations = {3, 0, 6, 1, 5};
    int result = sol.solution(citations);
    System.out.println(result);
  }

}

class Solution {
  public int solution(int[] citations) {
    Arrays.sort(citations);
    for (int i = 0; i < citations.length; i++) {
      int h = citations.length - i;
      if(citations[i] >= h) {
        return h;
      }
    }

    return 0;
  }
}