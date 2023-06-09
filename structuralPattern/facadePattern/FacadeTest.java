package structuralPattern.facadePattern;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import structuralPattern.facadePattern.maker.ShapeMaker;

public class FacadeTest {

    @Test
    public void facadeTest() {
        ShapeMaker shapeMaker = new ShapeMaker();

        assertEquals(shapeMaker.drawCircle(), "Circle Draw");
        assertEquals(shapeMaker.drawRectangle(),"Rectangle Draw");
        assertEquals(shapeMaker.drawSquare(),"Square Draw");
    }
}
