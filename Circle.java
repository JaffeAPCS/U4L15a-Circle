
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variables - replace the example below with your own

    public Circle(double r)
    {
        radius = r;
    }

    public double area()
    {
        // put your code here
        double a = Math.PI * radius * radius;
        return a;
    }
    
    public double circumference()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }
    
    public void setRadius(double r) 
    {
        radius = r;
    }
    
    public double radius;
}
