package OOP.OOP;

public class Computer {
    private Processor processor;
    private Ram ram;
    public Computer(Processor processor, Ram ram){ // constructor method
        this.processor = processor;
        this.ram = ram;
    }
    public void run(){
        System.out.println("Computer processor has: "+processor.size+" number of cores");
        System.out.println("Computer ram is made by: "+ram.name);

    }
}

