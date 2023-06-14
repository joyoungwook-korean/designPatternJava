package behavioralPattern.commandPattern;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import behavioralPattern.commandPattern.order.Broker;
import behavioralPattern.commandPattern.order.BuyStock;
import behavioralPattern.commandPattern.order.Order;
import behavioralPattern.commandPattern.order.SellStock;
import behavioralPattern.commandPattern.order.Stock;

public class CommandTest {

    @Test
    public void commandTest() {
        Stock abStock = new Stock();

        BuyStock buyStock = new BuyStock(abStock);
        SellStock sellStock = new SellStock(abStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        List<Order> orders = broker.placeOrders();

        assertEquals(orders.get(0).execute(), buyStock.execute());
        assertEquals(orders.get(1).execute(), sellStock.execute());

    }
}
