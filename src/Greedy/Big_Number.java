package Greedy;


public class Big_Number {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);

        // 단순히 while을 쓰면 시간초과가 난다.
        for(int i = 0; i < k; i++){
            int leng = sb.length();
            int idx = sb.length()-1;
            int prev, next;

            for(int j = 0; j < leng-1; j++){
                prev = sb.charAt(j);
                next = sb.charAt(j+1);
                if(prev < next){
                    idx = j;
                    break;
                }
            }
            sb.deleteCharAt(idx);
        }



        return sb.toString();
    }
}
