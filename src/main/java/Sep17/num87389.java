package Sep17;

public class num87389 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int n = 12;
    int result = sol.solution(n);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int n) {
    int answer = n;

    for (int i = 1; i <= n ; i++) {
      if(n % i == 1) {
        if(i <= answer) {
          answer = i;
        }
      }
    }

    return answer;
  }
}