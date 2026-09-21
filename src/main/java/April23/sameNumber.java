package April23;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class sameNumber {

  public static void main(String[] args) {
    int[] arr = {1, 1, 3, 3, 0, 1, 1};
    Solution sol = new Solution();
    int[] numList = sol.solution(arr);

    System.out.println(Arrays.toString(numList));
  }

}

class Solution {
  public int[] solution(int []arr) {
    int number = -1;
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if(number != arr[i]) {
        stack.push(arr[i]);
      }
      number = arr[i];
    }

    int size = stack.size();
    int[] answer = new int[size];
    for (int i = size - 1; i >=  0; i--) {
      answer[i] = stack.pop();
    }

    return answer;
  }
}