import java.util.ArrayList;

public class Customer {
    public String customerName;
    public ArrayList<Order> customerOrders;
    public ArrayList<Order> currentOrder;
    public double orderBalance;

    public Customer(String customerName, ArrayList<Order> customerOrders) {
        this.customerName = customerName;
        this.customerOrders = new ArrayList<Order>();
        this.currentOrder = new ArrayList<Order>();
        this.orderBalance = 0;
    }

    public void giveOrder(Order order) {
        customerOrders.add(order);
    }

    public void eatOrder(Robot robot) {
        for (int i = 0; i < robot.orders.size(); i++) {
            System.out.println(customerName + " is enjoying the " + robot.orders.get(i).foodType);
        }
    }


}
