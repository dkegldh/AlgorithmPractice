## 문제 소개
> 프로그래머스 · [하샤드 수](https://school.programmers.co.kr/learn/courses/30/lessons/12947)

양의 정수 `x`가 하샤드 수인지 판별하는 문제다. `x`의 각 자릿수를 모두 더한 값으로 `x`가 나누어떨어지면 하샤드 수이다. 예를 들어 18은 자릿수의 합이 9이고 18을 9로 나누면 나누어떨어지므로 하샤드 수다. `x`는 1 이상 10000 이하의 정수이다.

## 접근 방법
자릿수의 합만 구하면 나머지는 나눗셈 한 번으로 끝난다.

1. 나중에 나눗셈에 쓰기 위해 원래 값을 `originalNum`에 따로 저장해 둔다.
2. `x`가 0보다 큰 동안 `x % 10`으로 일의 자리를 꺼내 리스트에 담고, `x /= 10`으로 한 자리씩 줄여나간다.
3. 리스트에 담긴 자릿수를 모두 더해 `hab`을 구한다.
4. `originalNum % hab`이 0이 아니면 `false`, 0이면 `true`를 반환한다.

## 풀이 코드
```java
class Solution {
  public boolean solution(int x) {
    boolean answer = true;
    int originalNum = x;
    int hab = 0;
    List<Integer> number = new ArrayList<>();
    while (x > 0) {
      int num = x % 10;
      number.add(num);
      x /= 10;
    }
    for (int n : number) {
      hab += n;
    }
    if(originalNum % hab != 0) {
      answer = false;
    }

    return answer;
  }
}
```

## 시간 복잡도
`x`의 자릿수를 d라 하면 자릿수를 분리하는 반복문과 합을 구하는 반복문이 각각 d번 돌기 때문에 O(d) = O(log x)이다. `x`가 최대 10000이라 실제로는 최대 5번 정도만 반복한다.
