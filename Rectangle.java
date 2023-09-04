public class Rectangle {

    private double width;
    private double height;

    //constructor
    public Rectangle(double w, double h)
    {
        this.width = w;
        this.height = h;
    }
    
    //Getter method for width 
    public double getWidth()
    {
            return width;
    }

    //getter method for height 
    public double getHeight()
    {
        return height;
    } 

    //Method to calculate and return the are of the rectangle
    public double calculateArea()
    {
        return height * width;
    }

    //Method to calculate and return the perimeter of the rectangle
    public double calculatePerimeter()
    {
        return 2 * (height + width);
    }

    //Method to display the dimensions, area, and perimeter of the rectangle
    void displayInfo()
    {
        System.out.println("Rectangle Dimensions:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());

    }

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(6.0, 8.0);

        
        rectangle.displayInfo();
    }
}
