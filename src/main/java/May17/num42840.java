package May17;

import java.util.ArrayList;
import java.util.List;

public class num42840 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] answers = {1, 2, 3, 4, 5};
    int[] result = sol.solution(answers);
    System.out.println(result);
  }
}

class Solution {
  public int[] solution(int[] answers) {
    int[] answer;
    int[] stu1 = {1, 2, 3, 4, 5};
    int count1 = 0;
    int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int count2 = 0;
    int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int count3 = 0;
    int max = 0;
    for (int i = 0; i < answers.length; i++) {
      if(answers[i] == stu1[i % 5]) {
        count1++;
      }
      if(answers[i] == stu2[i % 8]) {
        count2++;
      }
      if(answers[i] == stu3[i % 10]) {
        count3++;
      }
    }
    int[] score = {count1, count2, count3};
    List<Integer> list = new ArrayList<>();
    for (int n : score) {
      max = Math.max(max, n);
    }
    for (int i = 0; i < score.length; i++) {
      if(score[i] == max) {
        list.add(i + 1);
      }
    }
    answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }

    return answer;
  }
}