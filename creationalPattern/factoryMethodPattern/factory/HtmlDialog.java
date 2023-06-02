package creationalPattern.factoryMethodPattern.factory;

import creationalPattern.factoryMethodPattern.buttons.Button;
import creationalPattern.factoryMethodPattern.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
