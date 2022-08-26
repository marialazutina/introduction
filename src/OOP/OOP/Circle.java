package OOP.OOP;

public class Circle {
    int base;
    int height;
    int radius;

    public void areaOfCircle(int radius) {
        this.radius = radius;
        double aCircle = Math.PI * (radius * radius);
        System.out.println("Area of circle is " + aCircle + " cm");
    }

    public void perimeterOfCircle(int radius) {
        this.radius = radius;
        double pCircle = (Math.PI * radius) * 2;
        System.out.println("Perimeter of circle is " + pCircle + " cm");
    }
}

