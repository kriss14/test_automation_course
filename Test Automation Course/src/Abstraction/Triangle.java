package Abstraction;

public class Triangle extends GeometricShape{
    double p=5;
    double r=7;

    public void calculateArea(){
        area = p*r;
        System.out.println("Area of Triangle is : "+area);
    }
}
