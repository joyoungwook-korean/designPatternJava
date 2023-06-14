package behavioralPattern.commandPattern.order;

public class BuyStock implements Order {
    private Stock abStock;

    public BuyStock(Stock stock) {
        this.abStock = stock;
    }

    public String execute() {
        return abStock.buy();
    }

}
