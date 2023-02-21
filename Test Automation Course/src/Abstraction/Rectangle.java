package Abstraction;

public class Rectangle extends GeometricShape{
    double a=5;
    public void calculateArea()
    {
        area = a*a;
        System.out.println("Area of Rectangle : "+area);
    }
}
