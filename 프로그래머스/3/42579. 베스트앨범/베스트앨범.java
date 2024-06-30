import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 1. 장르별 총 재생 수를 저장하는 맵
        HashMap<String, Integer> genrePlayCount = new HashMap<>();
        
        // 2. 장르별로 노래 정보를 저장하는 맵
        HashMap<String, ArrayList<int[]>> genreSongs = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            // 장르별 총 재생 수 계산
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);
            
            // 장르별 노래 리스트 저장
            genreSongs.putIfAbsent(genre, new ArrayList<>());
            genreSongs.get(genre).add(new int[]{i, play});
        }
        
        // 3. 장르별 총 재생 수를 기준으로 정렬
        List<String> genreRank = new ArrayList<>(genrePlayCount.keySet());
        genreRank.sort((a, b) -> genrePlayCount.get(b) - genrePlayCount.get(a));
        
        // 4. 결과를 저장할 리스트
        List<Integer> result = new ArrayList<>();
        
        // 5. 각 장르별로 가장 많이 재생된 두 곡을 선택
        for (String genre : genreRank) {
            List<int[]> songs = genreSongs.get(genre);
            
            // 재생 수 기준으로 정렬
            songs.sort((a, b) -> b[1] - a[1]);
            
            // 최대 두 곡 선택
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                result.add(songs.get(i)[0]);
            }
        }
        
        // 6. 결과를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}