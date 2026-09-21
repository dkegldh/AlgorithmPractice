package May23;

public class num132267 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int a = 2;
    int b = 1;
    int n = 20;
    int result = sol.solution(a, b, n);
    System.out.println(result);
  }

}

class Solution {
  public int solution(int a, int b, int n) {
    int answer = 0;
    int count;
    int rest;
    int next;
    count = n / a;
    next = (count * b) + (n % a);
    answer += count * b;
    // n개의 병의 개수를 a개로 나눴을때 몫에 b를 곱해주고 count에 더해주고
    // 몫을 다음 a개로 다시 나눠줌
    while(next / a != 0) {
      count = next / a;
      rest = next % a;
      next = (count * b) + rest;
      answer += count * b;
    }
    return answer;
  }
}