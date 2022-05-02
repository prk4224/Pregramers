package Greedy;

import java.util.*;


public class Joy_Stick {
    public int solution(String name) {
        int answer = 0;

        // 전체를 이동하면 변환 가능하므로 이동 횟수를 name의 길이로 초기화.
        int move = name.length()-1;
        int leng = name.length();

        for(int i = 0; i < leng; i++){
            // 문자 변환 횟수는 변함 없음.
            answer += Math.min((name.charAt(i) - 'A'), ('Z' - name.charAt(i))+1);

            int index = i +1;

            // 연속인 A의 갯수
            while(index < leng && name.charAt(index) == 'A'){
                index++;
            }

            // i*2+leng-index : 오른쪽으로 진행 -> A가 있을때 반대로 돌아간 경우
            // (leng-index)*2 +i : 왼쪽으로 진행 -> A가 있을때 반대로 돌아간 경우
            move = Math.min(move,(Math.min(i*2+leng-index, (leng-index)*2 +i )));
        }

        return answer + move;
    }
}
