package creationalPattern.factoryMethodPattern.buttons;

public class WindowsButton implements Button {

    @Override
    public String render() {
        onClick();
        return "Window Button";
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Windows Button");
    }

}