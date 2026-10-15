// https://school.programmers.co.kr/learn/courses/30/lessons/138477 Lv.1
package October.Oct15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class num138477 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int k = 3;
    int[] score = {10, 100, 20, 150, 1, 100, 200};
    int[] result = sol.solution(k, score);
    System.out.println(Arrays.toString(result));
  }
}

class Solution {
  public int[] solution(int k, int[] score) {
    int[] answer = new int[score.length];
    List<Integer> rank = new ArrayList<>();

    rank.add(score[0]);
    answer[0] = score[0];

    for (int i = 1; i < score.length; i++) {
      if(rank.size() >= k) {
        int min = Collections.min(rank);
        if(min < score[i]) {
          rank.remove((Integer) min);
          rank.add(score[i]);
        }
      } else {
        rank.add(score[i]);
      }
      answer[i] = Collections.min(rank);
    }

    return answer;
  }
}