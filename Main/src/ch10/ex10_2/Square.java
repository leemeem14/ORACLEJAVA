package ch10.ex10_2;


public class Square extends Shape{
    int pointNum=4;
    public double area(int width) {
        double area = Math.pow(width,2);
        return area;
    }
}
