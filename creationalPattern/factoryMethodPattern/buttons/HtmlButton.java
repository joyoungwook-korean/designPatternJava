package creationalPattern.factoryMethodPattern.buttons;

public class HtmlButton implements Button {

    @Override
    public String render() {
        onClick();
        return "Html Button";
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Html Button");
    }

}
