package myclient.BackTracking;

import javax.swing.text.html.ListView;

public class fourMaze {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] isVisited = new boolean[row][col];
        print(0, 0, row-1, col-1, " ", isVisited);
    }

    static void print(int sr,int sc,int er,int ec, String s, boolean[][] isVisited){
        if(sr<0 || sc <0) return;
        if(sr>er || sc>er) return;
        if(isVisited [sr][sc] == true) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        print(sr, sc+1, er, ec, s+"L", isVisited);
        print(sr+1, sc, er, ec, s+"D", isVisited);
        print(sr, sc-1, er, ec, s+"R", isVisited);
        print(sr-1 , sc, er, ec, s+"U", isVisited);
        isVisited[sr][sc] = false;
    }
}
