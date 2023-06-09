package structuralPattern.proxyPattern;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import structuralPattern.proxyPattern.image.Image;
import structuralPattern.proxyPattern.image.ProxyImage;

public class ProxyTest {
    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void proxyImage() {
        Image image = new ProxyImage("proxy.jpg");

        image.display();
        assertEquals(outputStreamCaptor.toString(), "loading proxy.jpg\n");
    }
}
