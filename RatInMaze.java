public class RatInMaze {

    static boolean isValidMove(int[][] maze, int x, int y, boolean[][] visited) {
        int rows = maze.length;
        int cols = maze[0].length;
        return x >= 0 && x < rows && y >= 0 && y < cols && maze[x][y] == 1 && !visited[x][y];
    }

    static boolean dfs(int[][] maze, int x, int y, boolean[][] visited) {
        if (!isValidMove(maze, x, y, visited)) {
            return false;
        }

        if (maze[x][y] == 9) {
            return true;
        }

        visited[x][y] = true;
        System.out.println("Visiting cell: (" + x + ", " + y + ")");

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (dfs(maze, newX, newY, visited)) {
                return true;
            }
        }

        return false;
    }

    static boolean canReachCheese(int[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];
        return dfs(maze, 0, 0, visited);
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {0, 0, 1, 0},
            {0, 1, 1, 9}
        };

        boolean result = canReachCheese(maze);
        if (result) {
            System.out.println("Mouse can reach the cheese.");
        } else {
            System.out.println("Mouse cannot reach the cheese.");
        }
    }
}
