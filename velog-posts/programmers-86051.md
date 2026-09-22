## 문제 소개
> 프로그래머스 · [없는 숫자 더하기](https://school.programmers.co.kr/learn/courses/30/lessons/86051)

0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 `numbers`가 주어진다. `numbers`에 존재하지 않는 0~9 사이의 숫자를 모두 찾아 그 합을 return하는 문제다. 배열의 길이는 1~9이고, 원소는 모두 서로 다른 0~9 사이의 값이다.

## 접근 방법
0부터 9까지의 숫자를 담은 리스트를 하나 만들고, `numbers`에 등장하는 숫자를 리스트에서 제거해나간다. 최종적으로 리스트에 남은 숫자들이 곧 "없는 숫자"이므로, 이를 모두 더해서 반환한다.

1. `List<Integer>`에 0~9를 순서대로 채운다.
2. `numbers`를 순회하면서 리스트에 해당 값이 있으면 제거한다.
3. 리스트에 남은 값을 모두 더해 answer로 반환한다.

## 풀이 코드
```java
class Solution {
  public int solution(int[] numbers) {
    int answer = 0;
    List<Integer> num = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      num.add(i, i);
    }

    for (int i : numbers) {
      if(num.contains(i)) {
        num.remove(Integer.valueOf(i));
      }
    }

    for (int n : num) {
      answer += n;
    }

    return answer;
  }
}
```

## 시간 복잡도
`numbers`의 각 원소마다 `contains`와 `remove`를 호출하는데, `ArrayList`에서 이 두 연산은 각각 O(n)이다. `numbers`의 길이를 m(최대 9), 리스트 크기를 n(최대 10)이라 하면 전체는 O(m·n)이다. 입력 크기가 최대 9~10으로 고정되어 있어 사실상 상수 시간에 가깝다.

## 배운 점
`num.remove(i)`로 처음 작성했을 때, `i`가 int(원시 타입)이기 때문에 자바가 이를 `remove(Object)`가 아닌 `remove(int index)`, 즉 인덱스 제거로 해석해서 의도와 다르게 동작하는 문제를 발견했다. 값으로 제거하려면 `num.remove(Integer.valueOf(i))`처럼 `Integer`로 박싱해서 `remove(Object)` 오버로드가 호출되도록 해야 한다.
