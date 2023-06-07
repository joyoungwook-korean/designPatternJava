package creationalPattern.abstractFactoryPattern.factories;

import creationalPattern.abstractFactoryPattern.buttons.Button;
import creationalPattern.abstractFactoryPattern.buttons.WindowOSButton;
import creationalPattern.abstractFactoryPattern.checkboxes.Checkbox;
import creationalPattern.abstractFactoryPattern.checkboxes.WindowOSCheckbox;

public class WindowOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowOSCheckbox();
    }
}
