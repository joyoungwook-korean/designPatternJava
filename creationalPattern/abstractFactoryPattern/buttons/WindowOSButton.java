package creationalPattern.abstractFactoryPattern.buttons;

public class WindowOSButton implements Button {

    @Override
    public String paint() {
        return "create Window OS Button";
    }
}
