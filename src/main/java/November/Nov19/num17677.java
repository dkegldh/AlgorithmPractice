// https://school.programmers.co.kr/learn/courses/30/lessons/17677 Lv.2
package November.Nov19;


import java.util.ArrayList;
import java.util.List;

public class num17677 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String str1 = "FRANCE";
    String str2 = "french";
    int result = sol.solution(str1, str2);
    System.out.println(result);
  }
}

class Solution {
  public int solution(String str1, String str2) {
    int answer = 0;
    String str1Lower = str1.toLowerCase();
    String str2Lower = str2.toLowerCase();
    List<Character> alphabetList = new ArrayList<>();
    List<String> str1List = new ArrayList<>();
    List<String> str2List = new ArrayList<>();
    int inter = 0;

    for (char c = 'a'; c <= 'z'; c++) {
      alphabetList.add(c);
    }

    for (int i = 0; i < str1.length() - 1; i++) {
      StringBuilder sb = new StringBuilder();
      for (int k = i; k < i + 2; k++) {
        if(alphabetList.contains(str1Lower.charAt(k))) {
          sb.append(str1Lower.charAt(k));
        }
      }
      if(sb.length() == 2) {
        str1List.add(sb.toString());
      }
    }
    for (int j = 0; j < str2.length() - 1; j++) {
      StringBuilder sb = new StringBuilder();
      for (int k = j; k < j + 2; k++) {
        if(alphabetList.contains(str2Lower.charAt(k))) {
          sb.append(str2Lower.charAt(k));
        }
      }
      if(sb.length() == 2) {
        str2List.add(sb.toString());
      }
    }

    List<String> dupList = new ArrayList<>(str2List);
    for (String s : str1List) {
      if(dupList.contains(s)) {
        inter++;
        dupList.remove(s);
      }
    }
    int union = str1List.size() + str2List.size() - inter;

    if(union > 0) {
      double d = (double) inter / union;
      answer = (int) (d * 65536);
    } else {
      answer = 65536;
    }

    return answer;
  }
}