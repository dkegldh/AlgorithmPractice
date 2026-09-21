package April09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class num1181 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 단어의 개수
    int num = sc.nextInt();

    // 중복 제거
    Set<String> words = new HashSet<>(num);

    for (int i = 0; i < num; i++) {
      String word = sc.next();
      words.add(word);
    }

    // Set을 List로 변환
    List<String> sortedWords = new ArrayList<>(words);


    Collections.sort(sortedWords, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        // 길이가 같은 경우 사전 순 정렬
        if (o1.length() == o2.length()) {
          return o1.compareTo(o2);
        }
        // 길이가 다른 경우 길이 순 정렬
        return o1.length() - o2.length();
      }
    });

    for(String w : sortedWords) {
      System.out.println(w);
    }
  }

}
