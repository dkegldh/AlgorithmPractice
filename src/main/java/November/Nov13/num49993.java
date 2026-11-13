// https://school.programmers.co.kr/learn/courses/30/lessons/49993 Lv.2
package November.Nov13;

import java.util.ArrayDeque;
import java.util.Queue;

public class num49993 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String skill = "CBD";
    String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
    int result = sol.solution(skill, skill_trees);
    System.out.println(result);
  }
}

class Solution {
  public int solution(String skill, String[] skill_trees) {
    int answer = 0;

    for (int i = 0; i < skill_trees.length; i++) {
      Queue<Character> skillQueue = new ArrayDeque<>();
      Queue<Character> skillTreesQueue = new ArrayDeque<>();
      for (int j = 0; j < skill.length(); j++) {
        skillQueue.add(skill.charAt(j));
      }

      for (int k = 0; k < skill_trees[i].length(); k++) {
        if(skillQueue.contains(skill_trees[i].charAt(k))) {
          skillTreesQueue.add(skill_trees[i].charAt(k));
        }
      }
      int num = skillTreesQueue.size();

      for (int n = 0; n < num; n++) {
        if(skillQueue.peek() != skillTreesQueue.peek()) {
          break;
        } else {
          skillQueue.poll();
          skillTreesQueue.poll();
        }
      }
      if(skillTreesQueue.isEmpty()) {
        answer++;
      }
    }

    return answer;
  }
}