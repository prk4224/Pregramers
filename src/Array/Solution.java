package Array;

import java.util.StringTokenizer;

public class Solution {
    public static  void main(String[] args) throws Exception {

        String s = "3people unFollowed me";

        String answer = "";

        StringTokenizer st = new StringTokenizer(s, " ");

        int N = st.countTokens();
        String str[] = new String[N];
        for(int i = 0; i < N; i++){
            str[i] = st.nextToken();
        }
        String result[] = new String[N];

        for (int i = 0; i < str.length; i++) {

            for(int j = 0; j < str[i].length(); j++){
                if(j ==0) {
                    if (str[i].charAt(j) >= 'a' && str[i].charAt(j) <= 'z') {
                        result[i] += (char) (str[i].charAt(j) - ' ');
                    }
                    else {
                        result[i] += (char) (str[i].charAt(j));
                    }
                }
                else{
                    if (str[i].charAt(j) >= 'A' && str[i].charAt(j) <= 'Z'){
                        result[i] += (char) (str[i].charAt(j) + ' ');
                    }
                    else{
                        result[i] += (char) (str[i].charAt(j));
                    }
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for(int j = 4; j < result[i].length(); j++){
                answer += result[i].charAt(j);
            }
            answer += " ";
        }
        System.out.println(answer);
    }
}
