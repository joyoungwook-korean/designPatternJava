package creationalPattern.factoryMethodPattern.factory;

import creationalPattern.factoryMethodPattern.buttons.Button;
import creationalPattern.factoryMethodPattern.buttons.WindowsButton;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
