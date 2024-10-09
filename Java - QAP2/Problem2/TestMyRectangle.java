package Problem2;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Test using coordinates
        MyRectangle rect1 = new MyRectangle(1, 5, 4, 1);
        System.out.println("\n" + rect1); 
        System.out.println("Area: " + rect1.getArea()); 
        System.out.println("Perimeter: " + rect1.getPerimeter() + "\n"); 

        // Test using MyPoint objects
        MyPoint topLeftPoint = new MyPoint(2, 6);
        MyPoint bottomRightPoint = new MyPoint(5, 2);
        MyRectangle rect2 = new MyRectangle(topLeftPoint, bottomRightPoint);
        System.out.println(rect2); 
        System.out.println("Area: " + rect2.getArea()); 
        System.out.println("Perimeter: " + rect2.getPerimeter() + "\n"); 

        // Test setters and getters
        rect2.setTopLeft(new MyPoint(1, 4));
        rect2.setBottomRight(new MyPoint(3, 1));
        System.out.println(rect2); 
        System.out.println("Updated Area: " + rect2.getArea()); 
        System.out.println("Updated Perimeter: " + rect2.getPerimeter() + "\n");
    }
}
