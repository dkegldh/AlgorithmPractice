// https://school.programmers.co.kr/learn/courses/30/lessons/12943
package Sep26;

public class num12943 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int num = 626331;
    int result = sol.solution(num);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int num) {
    int answer = 0;
    long init = num;
    while(init != 1) {
      if(answer < 500) {
        if(init % 2 == 0) {
          init /= 2;
          answer++;
        } else {
          init = init * 3 + 1;
          answer++;
        }
      } else {
        return -1;
      }
    }

    return answer;
  }
}