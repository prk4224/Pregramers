package DFS_BFS;
// 1 1 1 0
// 1 2 2 0
// 1 0 0 1
// 0 0 0 1
// 0 0 0 3
// 0 0 0 3

import java.util.Arrays;

class Group_max_cut {
    public static void main(String[] args){

        System.out.println(Arrays.toString(solution(6,4)));
    }

    static long maxSizeOfOneArea = 0;
    static int M;
    static int N;
    static int picture[][] = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
    public static long[] solution(int m, int n) {
        long result = 0;

        M=m;
        N=n;

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                int num = dfs(i,j,picture[i][j],0);
                if( num > 0 ){
                    maxSizeOfOneArea = Math.max(num,maxSizeOfOneArea);
                    num = 0;
                    result++;
                }
            }
        }

        long[] answer = new long[2];
        answer[0] = result;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }
    public static int dfs (int x, int y, int target, int cut) {
        if(x < 0 || x >= M || y < 0 || y >= N || picture[x][y] == 0){
            return cut;
        }

        if(picture[x][y] == target){
            picture[x][y] = 0;
            cut++;

            dfs(x-1,y,target,cut);
            dfs(x+1, y,target,cut);
            dfs(x,y-1,target,cut);
            dfs(x,y+1,target,cut);
            return cut;

        }
        return 0;
    }
}
