// https://school.programmers.co.kr/learn/courses/30/lessons/131705
package October.Oct05;

public class num131705 {

  public static void main(String[] args) {
    Solution1 sol = new Solution1();
    int[] numbers = {-3, -2, -1, 0, 1, 2, 3};
    int result = sol.solution(numbers);
    System.out.println(result);
  }
}

class Solution1 {
  public int solution(int[] number) {
    int answer = 0;
    for (int i = 0; i < number.length; i++) {
      int num = number[i];
      for (int j = i + 1; j < number.length; j++) {
        int num1 = num + number[j];
        for (int k = j  +  1; k < number.length; k++) {
          int num2 = num1 + number[k];
          if(num2 == 0) {
            answer++;
          }
        }
        num = number[i];
      }
    }
    return answer;
  }
}