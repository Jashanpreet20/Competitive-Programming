import java.util.*;
import java.lang.*;

class make {

    public static boolean isSafe(int[][] maze, int srcx, int srcy, int newx, int newy, int row, int col,Boolean[][] visited) {
        // path closed toh nahi means == 1
        // out of bond
        // mark visited

        if ((newx >= 0 && newx < row) &&
                (newy >= 0 && newy < col) &&
                maze[newx][newy] == 1 &&
                visited[newx][newy] == false) 
                {
                return true;
            } 
             else {
            return false;
        }

    }

    public static void printAllPath(int[][] maze,int row,int col,int srcx,int srcy,StringBuilder output,Boolean[][] visited){
        
        // base case jb destination reached kr lunga
        // destination cordinates are row-1 and col -1
        if(srcx == row-1 && srcy == col -1){
            System.out.print(output);
            System.out.println();
            return;
        }

        //up
        int newx=srcx-1;
        int newy=srcy;
        if(isSafe(maze, srcx, srcy, newx, newy, row, col, visited)){

            visited[newx][newy]=true;   

            output.append("u");
            // call recursion
            printAllPath(maze, row, col, newx, newy, output, visited);

            // visited false using backtracing
            output.deleteCharAt(output.length() -1);
            visited[newx][newy]=false;
        }

        //down
        
          newx=srcx+1;
         newy=srcy;
        if(isSafe(maze, srcx, srcy, newx, newy, row, col, visited)){

            visited[newx][newy]=true;   

            output.append("d");
            // call recursion
            printAllPath(maze, row, col, newx, newy, output, visited);

            // visited false using backtracing
            output.deleteCharAt(output.length() -1);
            visited[newx][newy]=false;
        }

        //right
         newx=srcx;
         newy=srcy + 1;
        if(isSafe(maze, srcx, srcy, newx, newy, row, col, visited)){

            visited[newx][newy]=true;   

            output.append("r");
            // call recursion
            printAllPath(maze, row, col, newx, newy, output, visited);

            // visited false using backtracing
            output.deleteCharAt(output.length() -1);
            visited[newx][newy]=false;
        }
        // left

         newx=srcx;
         newy=srcy - 1;
        if(isSafe(maze, srcx, srcy, newx, newy, row, col, visited)){

            visited[newx][newy]=true;   

            output.append("l");
            // call recursion
            printAllPath(maze, row, col, newx, newy, output, visited);

            // visited false using backtracing
            output.deleteCharAt(output.length() -1);
            visited[newx][newy]=false;
        }

    }

    public static void main(String args[]) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 0 },
                { 1, 1, 1, 0 },
                { 1, 1, 1, 1 }
        };

        Boolean[][] visited = new Boolean[4][4];

        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                visited[i][j] = false;
            }
        }
        int srcx = 0;
        int srcy = 0;
        int row = 4;
        int col = 4;
        StringBuilder output = new StringBuilder();

        printAllPath(maze, row, col, srcx, srcy, output, visited);
    }
}