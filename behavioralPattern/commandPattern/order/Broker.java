package behavioralPattern.commandPattern.order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public List<Order> placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        return orderList;
    }

}
