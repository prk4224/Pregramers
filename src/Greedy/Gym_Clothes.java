package Greedy;

import java.util.*;

public class Gym_Clothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int lostcut  = lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 도난 당한 사람이 여벌 옷이 있을 경우 다른 사람에게 빌려주지 못하므로 먼저 처리
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){

                if( lost[i] == reserve[j]){
                    lostcut--;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == -1) break;
                if(lost[i]+1 == reserve[j] || lost[i]-1 == reserve[j]){
                    lostcut--;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer - lostcut;
    }
}
