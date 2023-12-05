package Homework;

public class Dog extends Animals {
    private String animalsName;
    private String breed;
    public Dog(String type, String diet, String avgLifeSpan, String animalsName, String breed){
        super (type,diet,avgLifeSpan);
        this.animalsName = animalsName;
        this.breed = breed;
    }
        @Override
        public void properties(){
        super.properties();
            System.out.println("Animal name: "+animalsName);
            System.out.println("Breed: "+breed);
        }
    }




