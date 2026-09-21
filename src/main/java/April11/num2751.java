package April11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class num2751 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    List<Integer> arr = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      arr.add(Integer.parseInt(br.readLine()));
    }

    Collections.sort(arr);
    for (int sortedNum : arr) {
      String number = String.valueOf(sortedNum);
      bw.write(number);
      bw.write("\n");
    }
    bw.flush();
  }

}
