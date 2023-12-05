package OOP;

public class Outer {
    private static int outerClassStaticField;
    private int outerClassField;

    void outerClassMethod(){
        System.out.println("I am from outer class");
    }

    public static class NestedStatic {
        public void useOuterClassField(){
            System.out.println(outerClassStaticField);

        }

    }

    public class Inner {
        public void useOuterClassField(){
            System.out.println(outerClassStaticField);
            outerClassMethod();
            System.out.println(outerClassField);
        }

    }
}
