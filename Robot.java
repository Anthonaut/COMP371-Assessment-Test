import java.util.ArrayList;

public class Robot {
    public int robotID;
    public ArrayList<Order> orders;
    public ArrayList<Order> tabList;

    public Robot(int robotID) {
        this.robotID = robotID;
        this.orders = new ArrayList<Order>();
        this.tabList = new ArrayList<Order>();
    }

    public void takeOrder(Customer customer){
        for (int i = 0; i < customer.customerOrders.size(); i++) {
            orders.add(customer.customerOrders.get(i));
        }
    }

    public void tabCustomer(Customer customer) {
        for (int i = 0; i < customer.customerOrders.size(); i++) {
            tabList.add(customer.customerOrders.get(i));
            customer.orderBalance += customer.customerOrders.get(i).price;
        }
        customer.customerOrders = new ArrayList<Order>();
    }

    public void generateCheck(Customer customer) {
        System.out.println("+-----+");
        for (int i = 0; i < tabList.size(); i++) {
            System.out.println("--> " + tabList.get(i).foodType + ": " + tabList.get(i).price);
        }
        System.out.println("Your total amount to be charged is " + customer.orderBalance);
        System.out.println("+-----+");
        System.out.println("Have a nice day");
        System.out.println("");
    }

}
