package May07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumList {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] num = {"119", "97674223", "1195524421"};
    boolean result = sol.solution(num);
    System.out.println(result);
  }

}

class Solution {
  public boolean solution(String[] phone_book) {

    Arrays.sort(phone_book);

    for (int i = 0; i < phone_book.length - 1; i++) {
      if(phone_book[i + 1].startsWith(phone_book[i])) {
        return  false;
      }
    }

    return true;
  }
}