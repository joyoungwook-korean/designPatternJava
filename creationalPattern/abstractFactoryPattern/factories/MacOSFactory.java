package creationalPattern.abstractFactoryPattern.factories;

import creationalPattern.abstractFactoryPattern.buttons.Button;
import creationalPattern.abstractFactoryPattern.buttons.MacOSButton;
import creationalPattern.abstractFactoryPattern.checkboxes.Checkbox;
import creationalPattern.abstractFactoryPattern.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
