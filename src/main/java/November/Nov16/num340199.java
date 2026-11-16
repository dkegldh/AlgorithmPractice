// https://school.programmers.co.kr/learn/courses/30/lessons/340199 Lv.1
package November.Nov16;

import java.util.Arrays;

public class num340199 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] wallet = {50, 50};
    int[] bill = {100, 241};
    int result = sol.solution(wallet, bill);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int[] wallet, int[] bill) {
    int answer = 0;
    boolean check = false;
    Arrays.sort(wallet);

    while (!check) {
      Arrays.sort(bill);
      if(bill[0] <= wallet[0] && bill[1] <= wallet[1]) {
        check = true;
      } else {
        bill[1] /= 2;
        answer++;
      }
    }

    return answer;
  }
}