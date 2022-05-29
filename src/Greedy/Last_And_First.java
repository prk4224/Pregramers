package Greedy;

public class Last_And_First {
    public int[] solution(int n, String[] words) {

        int index = 0;

        for(int i = 1; i < words.length; i++){
            if(words[i-1].charAt(words[i-1].length() -1) != words[i].charAt(0)){
                index = i;
                break;
            }

            for(int j = i-1; j >= 0; j--){
                if(words[i].equals(words[j])){
                    index = i;
                    break;
                }
            }
        }



        int[] answer = {index%n+1,index/n+1};


        if(index == 0) {
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
}
