public class TestMyLine {
    public static void main(String[] args) {
        // Test using constructor with coordinates
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println("\n" + line1); 
        System.out.println("Length: " + line1.getLength()); 
        System.out.println("Gradient: " + line1.getGradient());

        // Test using constructor with MyPoint objects
        MyPoint beginPoint = new MyPoint(1, 1);
        MyPoint endPoint = new MyPoint(4, 5);
        MyLine line2 = new MyLine(beginPoint, endPoint);
        System.out.println(line2); 
        System.out.println("Length: " + line2.getLength()); 
        System.out.println("Gradient: " + line2.getGradient()); 

        // Test getters and setters for begin and end points
        line2.setBeginXY(2, 3);
        line2.setEndXY(6, 7);
        System.out.println(line2); 
        System.out.println("Begin X: " + line2.getBeginX()); 
        System.out.println("End Y: " + line2.getEndY()); 

        // Test length and gradient after modifying points
        System.out.println("Updated Length: " + line2.getLength());
        System.out.println("Updated Gradient: " + line2.getGradient() + "\n");
    }
}
