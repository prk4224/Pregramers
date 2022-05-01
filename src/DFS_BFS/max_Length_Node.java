package DFS_BFS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class max_Length_Node {
    public static void main(String[] args) {
        int edge[][] = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int n = 6;

        System.out.println(solution(n,edge));
    }

    public static  int solution(int n, int[][] edge) {
        int answer = 0;

        int max = 0;

        ArrayList<Integer>[] map = new ArrayList[n];

        for(int i = 0; i < n; i++){
            map[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < edge.length; i++){
            int x = edge[i][0]-1;
            int y = edge[i][1]-1;

            map[x].add(y);
            map[y].add(x);
        }

        boolean vi[] = new boolean[n];
        int cut[] = new int[n];


        cut = bfs(0,vi,cut,map);

        for(int i = 0; i < n; i++){
            if(max < cut[i]){
                max = cut[i];
                answer = 1;
            }
            else if(max == cut[i]){
                answer++;
            }
        }

        return answer;
    }

    public static int[] bfs(int start,boolean vi[],int cut[],ArrayList<Integer>[] map){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        vi[start] = true;

        while(!q.isEmpty()){
            int x = q.poll();

            Iterator<Integer> iter = map[x].listIterator();
            while(iter.hasNext()) {
                int w = iter.next();
                if(!vi[w]) {
                    cut[w] = cut[x] + 1;
                    vi[w] = true;
                    q.add(w);
                }
            }
        }
        return cut;
    }
}
