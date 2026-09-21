package May24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class num42579 {

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};
    int[] result = sol.solution(genres, plays);
    System.out.print(Arrays.toString(result));
  }

}

class Solution {
  static class Song {
    int id;
    int play;

    public Song(int id, int play) {
      this.id = id;
      this.play = play;
    }
  }
  public int[] solution(String[] genres, int[] plays) {
    Map<String, Integer> playList = new HashMap<>();
    Map<String, List<Song>> genreSongs = new HashMap<>();
    for (int i = 0; i < genres.length; i++) {
      playList.put(genres[i], playList.getOrDefault(genres[i], 0) + plays[i]);

      if(!genreSongs.containsKey(genres[i])) {
        genreSongs.put(genres[i], new ArrayList<>());
      }
      genreSongs.get(genres[i]).add(new Song(i, plays[i]));
    }

    List<String> sortedGenres = new ArrayList<>(playList.keySet());
    sortedGenres.sort((a, b) -> playList.get(b) - playList.get(a));

    List<Integer> answerList = new ArrayList<>();

    for (String genre : sortedGenres) {
      List<Song> songs = genreSongs.get(genre);

      songs.sort((a, b) -> {
        if(a.play == b.play) {
          return a.id -b.id;
        }
        return b.play - a.play;
      });

      answerList.add(songs.get(0).id);
      if(songs.size() > 1) {
        answerList.add(songs.get(1).id);
      }
    }

    int[] answer = new int[answerList.size()];
    for (int i = 0; i < answerList.size(); i++) {
      answer[i] = answerList.get(i);
    }

    return answer;
  }
}