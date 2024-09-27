import java.util.List;

public class recurrsion {
//     maze backtracking
    public static int countWays(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int left= countWays(row-1,col);
        int right = countWays(row, col-1);

        return left +right;
    }
// arraylist giving the different path followed in different cases
    public static List<String> ways(List<String> list ,String way, int row, int col){
        if(row==1 && col==1){
            list.add(way);
            return null;
        }
if(row>1){
    ways(list,way+"D",row-1,col);
}
        if(col>1){
            ways(list,way+"R",row,col-1);
        }

        return list;


    }

//     maze problem based on the condition based on the arr if arr[i][j]== true you can chose that block in path

    public static void path(String str,boolean [][] maze, int row, int col){
        if(row==0 && col==0){
            System.out.println(str);
            return ;
        }
if(maze[row][col]==false){
    return;
}
        if(row>0){
            path(str+"D",maze,row-1,col);
        }
        if(col>0){
            path(str+"R",maze,row,col-1);
        }
    }


    public static void main(String[] args) {
//        System.out.println(countWays(3,3));
//        System.out.println(ways(new ArrayList<String>(),"",3,3).toString());
        boolean [][] maze={{true,true,true},{true,false,true},{true,true,true}};
        path("",maze,maze.length-1,maze[0].length-1);
    }
}
 