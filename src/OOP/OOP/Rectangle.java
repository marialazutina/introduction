package OOP.OOP;

public class Rectangle {
    int base;
    int height;
    int radius;
    int width;

    public void areaOfRectangle(int width, int height) {
        this.width = width;
        this.height = height;
        int aRectangle = width * height;
        System.out.println("Area of rectangle is " + aRectangle + " sq. cm");
    }
    public void perimeterOfRect(int width, int height){
        this.width = width;
        this.height = height;
        int pRectangle = (height+width)*2;
        System.out.println("Perimeter of rectangle is "+pRectangle+" cm");
    }
}
