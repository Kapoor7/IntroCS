public abstract class Shape {

    private String name;

    public Shape()
    {
        name = "Default shape";
    }

    public Shape(String shapeName)
    {
        name = shapeName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String shapeName)
    {
        name = shapeName;
    }

    public abstract double area ();


    public String toString()
    {
        return "My shape name is " + name + ".";
    }


}
