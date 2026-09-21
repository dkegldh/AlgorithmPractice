package May10;

import java.util.Arrays;
import java.util.PriorityQueue;

public class num42626 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int[] scoville = {1, 2, 3, 9, 10, 12};
    int k = 7;
    int result = sol.solution(scoville, k);
    System.out.println(result);
  }

}

class Solution1 {
  public int solution(int[] scoville, int K) {
    int answer = 0;
    PriorityQueue<Integer> sco = new PriorityQueue<>();
    for (int i = 0; i < scoville.length; i++) {
      sco.offer(scoville[i]);
    }
    if(sco.peek() != null) {
      while(sco.peek() < K) {
        if(sco.size() >= 2){
          int num1 = sco.poll();
          int num2 = sco.poll();
          int newNum = num1 + (num2 * 2);
          sco.offer(newNum);
          answer++;
        } else {
          return -1;
        }
      }
    }
    if(sco.peek() >= K) {
      return answer;
    } else {
      return -1;
    }
  }
}