package Sep21;

public class num12934 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    long n = 100;
    long result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution {
  public long solution(long n) {
    long answer = 0;
    long root = (long) Math.sqrt(n);
    if(root * root == n) {
      answer = (long) Math.pow(root + 1, 2);
    } else {
      answer = -1;
    }

    return answer;
  }
}