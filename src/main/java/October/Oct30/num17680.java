// https://school.programmers.co.kr/learn/courses/30/lessons/17680 Lv.2
package October.Oct30;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class num17680 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int cacheSize = 0;
    String[] cities = {"Jeju", "Jeju"};
    int result = sol.solution(cacheSize, cities);
    System.out.println(result);
  }
}

class Solution {
  public int solution(int cacheSize, String[] cities) {
    int answer = 0;
    List<String> cache = new LinkedList<>();
    String[] citiesLower = new String[cities.length];

    for (int i = 0; i < cities.length; i++) {
      citiesLower[i] = cities[i].toLowerCase();
    }

    for (String city : citiesLower) {
      if (!cache.isEmpty() && cache.size() == cacheSize) {
        if (cache.contains(city)) {
          cache.remove(city);
          cache.add(city);
          answer++;
        } else {
          cache.remove(0);
          cache.add(city);
          answer += 5;
        }
      } else {
        if (cache.contains(city) && cacheSize > 0) {
          cache.remove(city);
          cache.add(city);
          answer++;
        } else {
          cache.add(city);
          answer += 5;
        }
      }
    }

    return answer;
  }
}