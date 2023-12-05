package OOP;

public class SomeInterfaceImpl extends SomeParentClass implements SomeInterface, SomeOtherInterface {

    }


interface SomeInterface{
    default void someMethod(String someArgument){
        System.out.println("Method is fired!");
    }

}

interface SomeOtherInterface{

}

class SomeParentClass{

}
