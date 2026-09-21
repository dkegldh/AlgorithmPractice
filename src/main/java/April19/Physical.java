package April19;

import java.util.Arrays;
import java.util.Scanner;

public class Physical {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 5;
    int[] lost = {2, 4};
    int[] reserve = {3};

    System.out.println(sol.solution(n, lost, reserve));
  }
}

class Solution {
  public int solution(int n, int[] lost, int[] reserve) {
    int answer = 0;
    int[] students = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      students[i] = 1;
    }
    for(int i : lost) {
      students[i]--;
    }
    for(int i : reserve) {
      students[i]++;
    }

    for (int i = 1; i <= n; i++) {
      if(students[i] == 0) {
        if(i - 1 >= 1 && students[i - 1] == 2) {
          students[i]++;
          students[i - 1]--;
        } else if (i + 1 <= n && students[i + 1] == 2) {
          students[i]++;
          students[i + 1]--;
        }
      }
    }
    for(int i : students) {
      if(i >= 1) {
        answer++;
      }
    }

    return answer;
  }
}
