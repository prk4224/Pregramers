package BruteForce;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prime_Search {

    public static int N;
    public static boolean vi[];
    public static int input[];
    public static int cut = 0;
    public static String result ="";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        N = str.length();
        input = new int[N];

        for(int i = 0; i < str.length(); i++){
            input[i] = str.charAt(i) - '0';
        }

        br.close();
        vi = new boolean[N];

        for(int i = 1 ; i <= str.length(); i++){
            int arr[] = new int[i];
            dfs(0,i,arr);
        }

        StringTokenizer st = new StringTokenizer(result," ");
        int leng = st.countTokens();
        int resultArr[] = new int[leng+1];

        for(int i = 1; i <= leng; i++){
            resultArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(resultArr);

        for(int i = 1; i <= leng; i++){
            if(resultArr[i-1] == resultArr[i]){
                continue;
            }
            if(prime(resultArr[i])){
                cut++;
            }
        }

        bw.write(cut+"");
        bw.flush();
        bw.close();

    }

    public static void dfs(int dep,int T,int arr[]){

        if(dep == T){
            String str = "";
            for(int var : arr){
                str += String.valueOf(var);
            }
            result +=  str + " ";

            return;
        }
        for(int i = 0; i < N; i++){
            if(dep ==0 && input[i] == 0){
                continue;
            }
            if(!vi[i]){
                vi[i] = true;
                arr[dep] = input[i];
                dfs(dep+1,T,arr);
                vi[i] = false;
            }
        }
        return;
    }

    public static boolean prime(int N){
        if(N == 0){
            return false;
        }
        if(N == 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(N); i++){
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }
}


