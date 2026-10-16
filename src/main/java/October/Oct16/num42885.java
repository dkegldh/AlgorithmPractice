// https://school.programmers.co.kr/learn/courses/30/lessons/42885 Lv.2
package October.Oct16;

import java.util.Arrays;

public class num42885 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int[] people = {70, 50, 80};
    int limit = 100;
    int result = sol.solution(people, limit);
    System.out.println(result);
  }
}

class Solution1 {
  public int solution(int[] people, int limit) {
    int answer = 0;
    int start = 0;
    int end = people.length - 1;
    Arrays.sort(people);
    while (end - start >= 0) {
      if(start == end) {
        answer++;
        break;
      } else {
        while (end - start > 0) {
          if(people[start] + people[end] <= limit) {
            start++;
            end--;
            answer++;
          } else {
            end--;
            answer++;
          }
        }
      }
    }
    return answer;
  }
}