package DFS_BFS;

public class Target_number {

    int answer = 0;
    int total = 0;

    public void dfs(int n[], int sum, int cut) {
        if (cut == n.length) {
            if (sum == total) {
                answer++;

            }
            return;
        }

        dfs(n, sum + n[cut], cut + 1);
        dfs(n, sum - n[cut], cut + 1);
    }

    public int solution(int[] numbers, int target) {
        total = target;
        dfs(numbers, 0, 0);
        return answer;
    }
}
