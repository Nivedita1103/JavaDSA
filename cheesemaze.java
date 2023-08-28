import java.util.Set;
import java.util.HashSet;
public class cheesemaze {
    int[] drow = new int[]{-1,1,0,0};
    int[] dcol = new int[]{0,0,-1,1};

    public boolean isReachable(int[][] maze) {
        if (maze == null || maze.length == 0) {
            return false;
        }
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        return isPath(maze, 0,0,visited);
    }
    private boolean isPath(int[][] maze, int row, int col, boolean[][] visited) {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) {
            return false;
        }

        if(maze[row][col] == 0) {
            visited[row][col] = true;
            return false;
        }
        if(maze[row][col] == 9) {
            visited[row][col] = true;
            return true;
        }

        if (maze[row][col] == 1 && !visited[row][col]) {
            visited[row][col] = true;
            return isPath(maze, row+1, col, visited) || isPath(maze,row - 1, col, visited) || isPath(maze, row, col - 1, visited)
                    || isPath(maze, row, col + 1, visited);

        }
        return false;
    }
}