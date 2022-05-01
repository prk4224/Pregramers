package DFS_BFS;
import java.util.*;

public class K_under {
    public static void main(String[] args){
        int road[][] =  {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
        int N = 6;
        int K = 4;

        System.out.println(solution(N,road,K));

    }

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;


        int map[][] = new int[N][N];

        for(int i = 0; i < road.length; i++){
            int x = road[i][0]-1;
            int y = road[i][1]-1;
            int z = road[i][2];

            map[x][y] = z;
            map[y][x] = z;
        }

        boolean vi[] = new boolean[N];
        int cut[] = new int[N];


        cut = bfs(0,vi,cut,map);

        for(int i = 0; i < N; i++){
            if(K <= cut[i]){
                answer++;;
            }
        }

        return answer;
    }
    public static int[] bfs(int start,boolean vi[],int cut[],int map[][]){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        vi[start] = true;

        while(!q.isEmpty()){
            int x = q.poll();

            for(int i = 0; i < map.length; i++){
                if(map[x][i] != 0 && !vi[i]){
                    vi[i] = true;
                    cut[i] = cut[x] + map[x][i];
                    q.offer(i);
                }
            }
        }
        return cut;
    }
}
