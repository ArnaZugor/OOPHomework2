package Task3;

import java.util.Arrays;

public class Task3Main {
    public static void main (String [] args) {

        Robot robot = new Robot(4, 4);

        robot.moveSouth();
        robot.moveWest();
        robot.moveWest();
        robot.moveNorth();
        robot.moveNorth();

        System.out.println(Arrays.toString(robot.getPosition()));

        System.out.println(robot.getMoves());

        robot.moveEast();

        robot.printLastPosition();

        System.out.println(robot.getDistance());
    }
}

