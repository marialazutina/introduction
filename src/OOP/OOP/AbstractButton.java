package OOP.OOP;

public abstract class AbstractButton implements ComponentClickListener{
    public static final String TAG = "Button";

    String componentName;

    String getComponentName(){
        return componentName;
    }

    abstract void click();
}
