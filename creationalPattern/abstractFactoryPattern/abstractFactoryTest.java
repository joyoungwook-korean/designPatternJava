package creationalPattern.abstractFactoryPattern;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import creationalPattern.abstractFactoryPattern.app.Application;
import creationalPattern.abstractFactoryPattern.factories.GUIFactory;
import creationalPattern.abstractFactoryPattern.factories.MacOSFactory;
import creationalPattern.abstractFactoryPattern.factories.WindowOSFactory;

@DisplayName("abstactPattern")
public class abstractFactoryTest {

    @Test
    public void MacTest() {
        GUIFactory factory = new MacOSFactory();
        Application app = new Application(factory);
        app.paint();

        assertEquals(app.buttonPaint(), "create Mac OS Button");
        assertEquals(app.checkBoxPaint(), "create Mac OS Checkbox");
    }

    @Test
    public void WindowTest() {
        GUIFactory factory = new WindowOSFactory();
        Application app = new Application(factory);
        app.paint();

        assertEquals(app.buttonPaint(), "create Window OS Button");
        assertEquals(app.checkBoxPaint(), "create Window OS Checkbox");
    }
}
