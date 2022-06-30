package Kakao;

import java.util.*;
public class Tuple {
    public int[] solution(String s) {

        HashMap<Integer,Integer> hash = new HashMap<>();
        String str = "";

        for(int i = 2; i < s.length()-1; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                str += String.valueOf(s.charAt(i)); //연속된 숫자를 담을 문자열

            }
            else if( (s.charAt(i) == ',' || s.charAt(i) == '}') && str != "") {
                int key = Integer.parseInt(str);
                str = "";

                if(hash.containsKey(key)){
                    int newValue = hash.get(key) + 1;
                    hash.put(key,newValue);
                }
                else{
                    hash.put(key,1);
                }

            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(hash.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        int size = hash.size();
        int answer[] = new int[size];
        int i = 0;

        for(Map.Entry<Integer, Integer> entry : entryList){
            answer[i] = entry.getKey();
            i++;
        }
        return answer;
    }
}
