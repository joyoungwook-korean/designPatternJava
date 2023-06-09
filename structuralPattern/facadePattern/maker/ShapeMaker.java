package structuralPattern.facadePattern.maker;

import structuralPattern.facadePattern.shape.Circle;
import structuralPattern.facadePattern.shape.Rectangle;
import structuralPattern.facadePattern.shape.Shape;
import structuralPattern.facadePattern.shape.Square;

public class ShapeMaker {
    private Shape rectangle;
    private Shape circle;
    private Shape square;

    public ShapeMaker() {
        this.rectangle = new Rectangle();
        this.circle = new Circle();
        this.square = new Square();
    }

    public String drawCircle() {
        return circle.draw();
    }

    public String drawRectangle() {
        return rectangle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }
}
