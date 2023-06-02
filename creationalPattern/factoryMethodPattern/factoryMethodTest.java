package creationalPattern.factoryMethodPattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import creationalPattern.factoryMethodPattern.factory.Dialog;
import creationalPattern.factoryMethodPattern.factory.HtmlDialog;
import creationalPattern.factoryMethodPattern.factory.WindowDialog;

public class factoryMethodTest {
    private static Dialog dialog;

    @Test
    public void factoryTest() {
        viewButton("Window");
        assertEquals(runRender(), "Window Button");

        viewButton("null");
        assertEquals(runRender(), "Html Button");

    }

    private void viewButton(String os) {
        if (os == "Window") {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static String runRender() {
        return dialog.render();
    }
}
