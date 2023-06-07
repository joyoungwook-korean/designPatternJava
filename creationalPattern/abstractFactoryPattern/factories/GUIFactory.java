package creationalPattern.abstractFactoryPattern.factories;

import creationalPattern.abstractFactoryPattern.buttons.Button;
import creationalPattern.abstractFactoryPattern.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
