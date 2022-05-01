package DFS_BFS;

public class Back_Tracking {
    public static void main(String[] args){
        int no = 4;
        int works[] = {4,3,3};
        System.out.println(solution(no,works));
    }

    static int min = Integer.MAX_VALUE;
    static int arr[];
    public static int solution(int no, int[] works) {

        arr = new int[no];

        bt(no,0,works);

        return min;
    }

    public static void bt(int N, int dep, int[] works){
        if(N == dep){
            int sum = 0;
            for(int i = 0; i < N; i++){
                if(works[arr[i]] != 0){
                    works[arr[i]]--;
                }
            }

            for(int i = 0; i < works.length; i++){
                sum += Math.pow(works[i],2);
            }

           min = Math.min(sum,min);


            for(int i = 0; i < N; i++){
                works[arr[i]]++;
            }

            return;
        }

        for(int i = 0; i < works.length; i++){
            arr[dep] = i;
            bt(N,dep+1,works);

        }
    }
}
