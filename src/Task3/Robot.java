package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Robot {

    private int x;
    private int y;
    private int moves;
    private ArrayList<int[]> allMoves;
    private double startingDistance;

    public Robot(){
        this(0, 0);
    }

    public Robot(int x, int y){
        this.x = x;
        this.y = y;
        this.moves = 0;
        this.allMoves = new ArrayList<>();
        recordMove();
        this.startingDistance = getDistance();
    }

    public void moveSouth(){
        this.y--;
        recordMove();
    }

    public void moveNorth(){
        this.y++;
        recordMove();
    }

    public void moveEast(){
        this.x++;
        recordMove();
    }

    public void moveWest(){
        this.x--;
        recordMove();
    }

    public int[] getPosition(){
        return new int[] {this.x, this.y};
    }

    public double getDistance(){
        int[] startingPosition = allMoves.get(0);
        int[] currentPosition = getPosition();
        return Math.sqrt(Math.pow(currentPosition[0] - startingPosition[0], 2) + Math.pow(currentPosition[1] - startingPosition[1], 2));
    }

    public int getMoves(){
        return this.moves -1;
    }

    public void printLastPosition(){
        System.out.println(Arrays.toString(getPosition()));
    }

    private void recordMove(){
        this.moves++;
        int[] currentPosition = {this.x, this.y};
        this.allMoves.add(currentPosition);
    }
}
