package Homework;

public class Animals {
    private String type;
    private String diet;
    private String avgLifeSpan;
    public Animals(String type, String diet, String avgLifeSpan){
        this.type = type;
        this.diet = diet;
        this.avgLifeSpan = avgLifeSpan;
    }
    public void properties(){
        System.out.println("Animal type: "+type);
        System.out.println("Animal diet: "+diet);
        System.out.println("Average life span: "+avgLifeSpan);

    }
}
