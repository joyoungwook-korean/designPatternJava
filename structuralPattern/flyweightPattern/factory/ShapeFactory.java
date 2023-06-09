package structuralPattern.flyweightPattern.factory;

import java.util.HashMap;

import structuralPattern.flyweightPattern.shapes.Circle;
import structuralPattern.flyweightPattern.shapes.Shape;

public class ShapeFactory {

    private static final HashMap circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create Circle " + color);
        }

        return circle;
    }

    public static HashMap getCircleMap() {
        return circleMap;
    }
}