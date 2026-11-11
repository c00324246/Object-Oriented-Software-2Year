

public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect);
    
rect.setLength(10.0f);
rect.setWidth(20.0f);
System.out.println(rect);


    rect.setLength(50.00f);
    rect.setWidth(-20.0f);
    System.out.println(rect);
    System.out.println("Area: " + rect.getArea());
    System.out.println("Perimeter: " + rect.getPerimeter());
    rect.printRectangle();


    rect.setLength(4.0f);
rect.setWidth(10.0f);
System.out.println(rect);
rect.printRectangle();


    } 
}

