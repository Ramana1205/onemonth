public class ratmaze{

    public static int ways(int[][] arr, boolean[][] vis, int i, int j, int m) {

        if (i < 0 || j < 0 || i >= m || j >= m)
            return 0;

        if (arr[i][j] == 0 || vis[i][j])
            return 0;

        if (i == m - 1 && j == m - 1)
            return 1;

        vis[i][j] = true;

        int w1 = ways(arr, vis, i + 1, j, m); // down
        int w2 = ways(arr, vis, i, j + 1, m); // right
        int w3 = ways(arr, vis, i - 1, j, m); // up
        int w4 = ways(arr, vis, i, j - 1, m); // left

        vis[i][j] = false; // backtrack

        return w1 + w2 + w3 + w4;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 1},
                {0, 1, 1},
                {1, 1, 1}
        };

        boolean[][] vis = new boolean[3][3];

        System.out.println(ways(arr, vis, 0, 0, 3));
    }
}