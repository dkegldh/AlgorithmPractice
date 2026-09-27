// https://school.programmers.co.kr/learn/courses/30/lessons/12948
package Sep27;

public class num12948 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String phone_number = "01033334444";
    String result = sol.solution(phone_number);
    System.out.println(result);
  }
}

class Solution {
  public String solution(String phone_number) {
    String answer = "";
    char[] arr = new char[phone_number.length()];
    for (int i = 0; i < phone_number.length(); i++) {
      arr[i] = phone_number.charAt(i);
    }
    int num_size = phone_number.length();
    int limit = num_size - 4;
    for (int i = 0; i < limit; i++) {
      arr[i] = '*';
    }

    answer = String.valueOf(arr);
    return answer;
  }
}