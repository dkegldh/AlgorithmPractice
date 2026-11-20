// https://school.programmers.co.kr/learn/courses/30/lessons/12977 Lv.1
package November.Nov20;

import java.util.HashSet;
import java.util.Set;

public class num12977 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {1,2,7,6,4};
    int result = sol.solution(nums);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int[] nums) {
    int answer = 0;
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int sum = nums[i] + nums[j] + nums[k];
          set.add(sum);
          double root = Math.sqrt(sum);
          boolean check = false;
          for (int n = 2; n <= root; n++) {
            if(sum % n == 0) {
              check = true;
              break;
            }
          }
          if(!check) {
            answer++;
          }
        }
      }
    }

    return answer;
  }
}