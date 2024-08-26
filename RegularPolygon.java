/**9.9 (GEOMETRY: N-SIDED REGULAR POLYGON) In an 𝑛-sided regular polygon, all sides have the same
length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
Design a class named RegularPolygon that contains:
A private int data field named n that defines the number of sides in the polygon with default value 3.
A private double data field named side that stores the length of the side with default value 1.
A private double data field named x that defines the 𝑥-coordinate of the polygon’s center with
default value 0.
A private double data field named y that defines the 𝑦-coordinate of the polygon’s center with
default value 0.
A no-arg constructor that creates a regular polygon with default values.
A constructor that creates a regular polygon with the specified number of sides and length of
side, centered at (0, 0).
A constructor that creates a regular polygon with the specified number of sides,
length of side, and 𝑥- and 𝑦-coordinates.
The accessor and mutator methods for all data fields.
The method getPerimeter() that returns the perimeter of the polygon.
The method getArea() that returns the area of the polygon.
The formula for computing the area of a regular polygon is: Area= 𝑛×𝑠^2/4×tan(𝜋/𝑛).
Draw the UML diagram for the class then implement the class. Write a test program that creates
three RegularPolygon objects, created using the no-arg constructor, using RegularPolygon(6, 4),
and using RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area. */

public class RegularPolygon {
    /** Private data fields */
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    //No-arg constructor
    public RegularPolygon() {}

    //Constructor with n and side
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }    
    
    //Constructor with n, side, x and y
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    public int sumOfInteriorAngles() {
        return (n-2) * 180;
    }

    //Ancestor and mutator methods
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide (double side) {
        this.side = side;
    }
    
    public double getX() {
        return x;
    }

    public void setX (double side) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY (double side) {
        this.y = y;
    }

    // Calculate the perimeter
    public double getPerimeter() {
        return n * side;
    }

    //Calculate the area
    public double getArea() {
        double radians = Math.PI / n;
        return (n *Math.pow(side, 2)) / (4 * Math.tan(radians));
    }

    //Main method to test
    public static void main(String[] args) {
        //Making objects using different constructors.
        RegularPolygon p1 = new RegularPolygon(); //Default constrictor
        RegularPolygon p2 = new RegularPolygon(6, 4); // Constrictor with n and side
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8); // Constructor with all parameters
    
        //Perimeter and area for each object displayed
        System.out.println("Polygon 1:");
        System.out.println("Perimeter: " + p1.getPerimeter());
        System.out.println("Area: " + p1.getArea());

        System.out.println("\nPolygon 2:");
        System.out.println("Perimeter: " + p2.getPerimeter());
        System.out.println("Area: " + p2.getArea());

        System.out.println("\nPolygon 3:");
        System.out.println("Perimeter: " + p3.getPerimeter());
        System.out.println("Area: " + p3.getArea());
    }
}