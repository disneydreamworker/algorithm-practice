import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String,HashSet<String>> bads = new HashMap<String,HashSet<String> >();
        
        for(String data: report){
            String[] temp = data.split(" ");
            //System.out.println("신고자"+temp[0]);
            //System.out.println("범법자"+temp[1]);
            //자기자신 신고경우
            if(temp[0].equals(temp[1])){
                continue;
            }
            //이미 신고를 당한경우
            if(bads.containsKey(temp[1])){
                HashSet<String> exists = bads.get(temp[1]);
                exists.add(temp[0]);
                bads.put(temp[1],exists);
            }
            //신고를 처음 당할경우
            else{
                HashSet<String> goods = new HashSet<>();
                goods.add(temp[0]);
                bads.put(temp[1],goods);
            }
        }
        ArrayList<String> k_report = new ArrayList<>();
        
        for(Map.Entry<String,HashSet<String>> temp : bads.entrySet() ){
            if(temp.getValue().size() >= k ){
                //k번 신고당한 자
                //System.out.println(temp.getKey());
                k_report.add(temp.getKey());
            }
        }
        //같은 case 신고 경우
        HashSet<String>flag = new HashSet<>();
         for(String data: report){
            String[] temp = data.split(" ");
            if(k_report.contains(temp[1])){
                if(flag.contains(data)){
                    continue;
                }
                flag.add(data);
                int value = Arrays.asList(id_list).indexOf(temp[0]);
                answer[value] = answer[value]+1;
            }
         } 
        return answer;
    }
}