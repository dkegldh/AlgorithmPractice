package April25;

import java.util.HashSet;
import java.util.Set;

public class Phonekemon {

  public static void main(String[] args) {
    int[] arr = {3, 3, 3, 2, 2, 4};

    Solution sol = new Solution();
    int result = sol.solution(arr);

    System.out.println(result);
  }

}

class Solution {
  public int solution(int[] nums) {
    int answer;
    Set<Integer> type = new HashSet<>();

    for (int num : nums) {
      type.add(num);
    }

    if(type.size() < (nums.length / 2)) {
      answer = type.size();
    } else {
      answer = nums.length / 2;
    }

    return answer;
  }
}