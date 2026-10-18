// https://school.programmers.co.kr/learn/courses/30/lessons/12953 Lv.2
package October.Oct18;

public class num12953 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] arr = {2,6,8,14};
    int result = sol.solution(arr);
    System.out.println(result);
  }
}

class Solution {
  private int lcm(int num1, int num2) {
    int commonDivisor = 0;
    int commonMultiple = 0;
    if(num1 < num2) {
      for (int i = 1; i <= num1; i++) {
        if(num1 % i == 0 && num2 % i == 0) {
          commonDivisor = i;
        }
      }
    } else {
      for (int j = 1; j <= num2; j++) {
        if(num2 % j == 0 && num1 % j == 0) {
          commonDivisor = j;
        }
      }
    }

    commonMultiple = num1 / commonDivisor * num2;

    return commonMultiple;
  }

  public int solution(int[] arr) {
    int answer = arr[0];

    for (int i = 1; i < arr.length; i++) {
      answer = lcm(answer, arr[i]);
    }

    return answer;
  }
}