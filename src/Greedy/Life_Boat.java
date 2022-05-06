package Greedy;
import java.util.*;

public class Life_Boat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        ArrayList arr = new ArrayList<>();

        for(int i : people){
            arr.add(i);
        }
        int curr = 0;



        if(curr > 0) answer++;

        return answer;
    }
}

// for(int i = 0; i < people.length; i++){
//             if(people[i] == 0) {
//                 continue;
//             }

//             if(curr == 0) {
//                 curr = people[i];
//                 people[i] = 0;
//             }


//             int sum = 0;
//             int idx = 0;

//             for(int j = 0; j < people.length; j++){
//                 if(people[j] == 0) continue;

//                 if(curr + people[j] <= limit && curr + people[j] > sum){
//                     sum = curr + people[j];
//                     idx = j;
//                     if(curr + people[j] == limit){
//                         break;
//                     }
//                 }
//             }

//             if(i == 0 && sum == 0) return people.length;


//             people[idx] = 0;
//             answer++;
//             curr = 0;
//         }
