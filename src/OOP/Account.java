package OOP;

public class Account {

    private double balance;
//    private int deposit;
//    private int withdraw;

    public Account(){
        this.balance = 0;
    }
    public Account(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance = balance + amount; // +=amount;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("You don't have enough money");
            return;
        }

        this.balance = balance - amount; // -=amount;
    }

    public double getBalance(){
        return this.balance;
    }

}


//SerializationStrategy(final String readableName){
//        this.readableName = readableName;
//        this.id = "0";
//    }
//    SerializationStrategy(final String readableName, final String id){
//        this.readableName = readableName;
//        this.id = id;
//    }
//
//    public String getReadableName(){
//        return readableName;
//    }
//}