package Homework;

public class Akita extends Dog {
    private int avgWeight;
    private int avgHeight;
    public Akita(String type, String diet, String avgLifeSpan,String animalsName, String breed, int avgWeight, int avgHeight){
        super(type,diet,avgLifeSpan, animalsName, breed);
        this.avgWeight = avgWeight;
        this.avgHeight = avgHeight;
    }
    @Override
        public void properties(){
        super.properties();
        System.out.println("Average weight: "+avgWeight+ " lb");
        System.out.println("Average weight: "+avgHeight+ " in");

    }

    }
