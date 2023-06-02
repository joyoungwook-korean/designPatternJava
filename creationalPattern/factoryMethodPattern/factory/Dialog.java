package creationalPattern.factoryMethodPattern.factory;

import creationalPattern.factoryMethodPattern.buttons.Button;

public abstract class Dialog {

    public String render() {
        Button okButton = createButton();
        return okButton.render();
    }

    public abstract Button createButton();
}
