package behavioralPattern.commandPattern.order;

public class SellStock implements Order {
    private Stock abStock;

    public SellStock(Stock stock) {
        this.abStock = stock;
    }

    public String execute() {
        return abStock.sell();
    }
}
