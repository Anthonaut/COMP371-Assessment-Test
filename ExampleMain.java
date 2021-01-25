import java.util.ArrayList;

public class ExampleMain {

    public static void main(String[] args){
        Chef boyardee = new Chef();
        Robot r1 = new Robot(1);
        Robot r2 = new Robot(2);
        Customer cus1 = new Customer("David", new ArrayList<>());
        Customer cus2 = new Customer("Sally", new ArrayList<>());

        cus1.giveOrder(new Order("Sandwich", 5.50));
        cus1.giveOrder(new Order("Root Beer", 2.75));
        r1.takeOrder(cus1);
        r1.tabCustomer(cus1);
        boyardee.cookOrder(r1);
        boyardee.giveRobotFood(r1);
        cus1.eatOrder(r1);
        r1.generateCheck(cus1);

        cus2.giveOrder(new Order("Alfredo Fettuccine", 7.25));
        cus2.giveOrder(new Order("Daiquiri", 4.50));
        r2.takeOrder(cus2);
        r2.tabCustomer(cus2);
        boyardee.cookOrder(r2);
        boyardee.giveRobotFood(r2);
        cus2.eatOrder(r2);
        r2.generateCheck(cus2);

    }
}
