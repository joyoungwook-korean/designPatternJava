package behavioralPattern.commandPattern.order;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public String buy() {
        return "Buy " + name + quantity;
    }

    public String sell() {
        return "Sell " + name + quantity;
    }
}
