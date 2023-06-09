package structuralPattern.flyweightPattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import structuralPattern.flyweightPattern.factory.ShapeFactory;
import structuralPattern.flyweightPattern.shapes.Circle;

public class FlyweightTest {
    private static final String colors[] = { "Red", "Green", "blue", "White", "Black" };

    @Test
    public void flyweightTest() {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            System.out.println(circle.draw());
        }

        HashMap map = ShapeFactory.getCircleMap();
        assertFalse(map.size() == 6);
        assertFalse(map.keySet().contains("Pupple"));
        assertTrue(map.keySet().contains("Green"));
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
