package July26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class num42839 {

  public static void main(String[] args) {
    String numbers = "17";
    Solution sol = new Solution();
    int answer = sol.solution(numbers);
    System.out.println(answer);
  }
}

class Solution {
  public static boolean[] used;
  Set<Integer> numberSet = new HashSet<>();

  public int solution(String numbers) {
    used = new boolean[numbers.length()];
    dfs(numbers, "");
    int answer = 0;
    for (int num : numberSet) {
      if(isPrime(num)) {
        answer++;
      }
    }

    return answer;
  }

  private void dfs(String numbers, String combination) {
    if(!combination.isEmpty()) {
      numberSet.add(Integer.parseInt(combination));
    }

    for (int i = 0; i < numbers.length(); i++) {
      if(used[i]) {
        continue;
      }
      used[i] = true;
      dfs(numbers,combination + numbers.charAt(i));
      used[i] = false;
    }
  }

  private boolean isPrime(int num) {
    if(num < 2) {
      return false;
    }
    for (int i = 2; (long) i * i <= num; i++) {
      if(num % i == 0) {
        return false;
      }
    }
    return true;
  }
}