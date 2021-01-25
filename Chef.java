import java.util.ArrayList;
import java.util.PriorityQueue;

public class Chef {

    public Chef() {

    }

    public void cookOrder(Robot robot) {
        for (int i = 0; i < robot.orders.size(); i++) {
            System.out.println("Making " + robot.orders.get(i).foodType);
        }
    }

    public void giveRobotFood(Robot robot) {
        for (int i = 0; i < robot.orders.size(); i++) {
            System.out.println("Giving Robot " + robot.robotID + " a finished " + robot.orders.get(i).foodType);
        }
    }



}
