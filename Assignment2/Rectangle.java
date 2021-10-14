/**
* The Rectangle class stores and manipulates
* data for a rectangle.
*/

public class Rectangle
{
    // instance variables are private
    private double length;
    private double width;

    // two constructors
    public Rectangle()
    {
        length = 0.0;
        width = 0.0;
    }
    
    public Rectangle(double len, double wid)
    {
        length = len;
        width = wid;
    }

    // set methods (mutators)
    public void setLength(double len)
    {
         length = len;
    }

    public void setWidth(double w)
    {
         width = w;
    }

    public void set(double len, double w)
    {
         length = len;
         width = w;
    }

    // get methods (accessors)
    public double getLength()
    {
         return length;
    }

    public double getWidth()
    {
         return width;
    }

    public double calcArea()
    {
         return length * width;
    }
    
    public double calcPerimeter()
    {
         return 2*(length + width);
    }
    
    public boolean isSquare() {
        return (length == width);
    }
    
    public String toString()
    {
         return ("Length = " + length + " Width = " + width);
    }
}