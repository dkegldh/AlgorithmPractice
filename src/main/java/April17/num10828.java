package April17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class num10828 {
  public static void method(String input, Stack<String> orderStack, BufferedWriter bw) throws IOException {
    // input을 " "으로 split해서 배열에 저장
    String[] arr = input.split(" ");

    switch (arr[0]) {
      case "push":
        orderStack.push(arr[1]);
        break;
      case "pop":
        if(orderStack.isEmpty()) {
          bw.write("-1");
          bw.newLine();
        } else {
          bw.write(orderStack.pop());
          bw.newLine();
        }
        break;
      case "size":
        bw.write(String.valueOf(orderStack.size()));
        bw.newLine();
        break;
      case "empty":
        if(orderStack.isEmpty()) {
          bw.write("1");
          bw.newLine();
        } else {
          bw.write("0");
          bw.newLine();
        }
        break;
      case "top":
        if(orderStack.isEmpty()) {
          bw.write("-1");
          bw.newLine();
        } else {
          bw.write(orderStack.peek());
          bw.newLine();
        }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int order = Integer.parseInt(br.readLine());
    Stack<String> orderStack = new Stack<>();

    for (int i = 0; i < order; i++) {
      String input = br.readLine();
      method(input, orderStack, bw);
    }

    bw.flush();
    bw.close();
  }

}
