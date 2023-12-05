package OOP.OOP;

public class ButtonComponent extends AbstractButton{
    @Override
    public void click(){
        System.out.println("Button was clicked");
    }

    @Override

    public void onClick(){
        System.out.println("I handle that click event!");
    }
}
