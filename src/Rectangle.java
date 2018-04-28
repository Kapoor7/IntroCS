public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle()
    {
        setName("Rectangle");
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(String name, double length, double width)
    {
        setName(name);
        this.length = length;
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }


    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double area()
    {
        return length * width;
    }

    public boolean equals (Object x)
    {
        return this == x;
    }

    public String toString()
    {
        return "This rectangle name is " + getName();
    }
}
