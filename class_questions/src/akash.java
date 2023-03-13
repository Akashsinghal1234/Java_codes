import java.io.*;
class circle {
    public double r;
    public double circumference()
    {
        return 2*3.14*r;

    }
    public double area ()
    {
        return 3.14*r*r;
    }
}
public class akash {
    public static void main(String[] args) {
        circle acircle = new circle();
        acircle.r=5;
        double area = acircle.area();
        double circumf = acircle.circumference();
        System.out.println("area = " + area);
        System.out.println("circumference = " + circumf);
    }
}

