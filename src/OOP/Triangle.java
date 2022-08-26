package OOP;

public class Triangle {
    int base;
    int height;
    int radius;
    int a;
    int b;
    int c;

    public void areaOfTriangle(int base, int height) {
        this.base = base;
        this.height = height;
        int aTriangle = (base * height) / 2;
        System.out.println("Area of triangle is " + aTriangle + " cm");
    }

    public void perimeterOfTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        int pTriangle = a + b + c;
        System.out.println("Perimeter of triangle is " + pTriangle + " cm");
    }
}