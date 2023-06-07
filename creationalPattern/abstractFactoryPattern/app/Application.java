package creationalPattern.abstractFactoryPattern.app;

import creationalPattern.abstractFactoryPattern.buttons.Button;
import creationalPattern.abstractFactoryPattern.checkboxes.Checkbox;
import creationalPattern.abstractFactoryPattern.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        System.out.println(button.paint());
        System.out.println(checkbox.paint());
    }

    public String buttonPaint() {
        return button.paint();
    }

    public String checkBoxPaint() {
        return checkbox.paint();
    }
}
