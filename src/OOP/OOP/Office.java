package OOP.OOP;

public class Office {
    private Heating heating;
    private CoffeeMachine coffeeMachine;

    public Office(Heating heating, CoffeeMachine coffeeMachine){
        this.heating = heating;
        this.coffeeMachine = coffeeMachine;
    }

    public void run(){
        System.out.println("Office heating is "+ heating.temperature);
        System.out.println("Coffee machine is "+ coffeeMachine.name);
    }
}

//Create a base class called Office and use composition
//        to give your office some features like
//        heating, coffee machine, and etc.