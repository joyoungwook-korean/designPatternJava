package structuralPattern.flyweightPattern.shapes;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Circle - x : " + x + " y : " + y + " color : " + color + " radius : " + radius;
    }
}
