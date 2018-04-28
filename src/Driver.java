public class Driver {
    public static void main (String[] args)
    {

        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle("Small Rectangle", 2.5, 4.0);

        String nameOfA = a.getName();
        System.out.println(nameOfA);
        double lengthOfA = a.getLength();
        System.out.println(lengthOfA);
        double widthOfA = a.getWidth();
        System.out.println(widthOfA);

        a.setName("new Name of rectangle");
        nameOfA = a.getName();
        System.out.println(nameOfA);

        a.setLength(3.5);
        lengthOfA = a.getLength();
        System.out.println(lengthOfA);

        a.setWidth(6.0);
        widthOfA = a.getWidth();
        System.out.println(widthOfA);

        double areaOfA = a.area();
        System.out.println("Area is " + areaOfA);

        System.out.println(a.toString());
        System.out.println(b.toString());

        String nameOfB = b.getName();

    }
}

