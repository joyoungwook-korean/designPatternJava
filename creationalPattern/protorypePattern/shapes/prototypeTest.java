package creationalPattern.protorypePattern.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class prototypeTest {

    @Test
    public void prototypeTest() {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle cloneCircle = (Circle) circle.clone();
        shapes.add(cloneCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> cloneShapes) {
        for (Shape shape : shapes) {
            cloneShapes.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            assertEquals(shapes.get(i), cloneShapes.get(i));
        }
    }

}
