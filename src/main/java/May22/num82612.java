package May22;

public class num82612 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int price = 3;
    int money = 20;
    int count = 4;
    long result = sol.solution(price, money, count);
    System.out.println(result);
  }

}

class Solution {
  public long solution(int price, int money, int count) {
    long total = 0;
    for (int i = 1; i <= count; i++) {
      int basePrice = price;
      total += basePrice * i;
    }
    long answer = total - money;

    if(answer < 0) {
      return 0;
    } else {
      return answer;
    }
  }
}