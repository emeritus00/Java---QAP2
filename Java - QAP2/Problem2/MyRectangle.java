package Problem2;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor using coordinates
    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor using MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter and Setter methods for top-left and bottom-right points
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight){
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX(){
        return topLeft.getX();
    }

    public void setTopLeftX(int x){
        topLeft.setX(x);
    }

    public int getTopLeftY(){
        return topLeft.getY();
    }

    public void setTopLeftY(int y){
        topLeft.setY(y);
    }

    public int getBottomRightX(){
        return topLeft.getX();
    }

    public void setBottomRightX(int x){
        topLeft.setX(x);
    }

    public int getBottomRightY(){
        return topLeft.getY();
    }

    public void setBottomRightY(int y){
        topLeft.setY(y);
    }

    public int[] getTopLeftXY() {
        return topLeft.getXY();
    }

    public void setTopLeftXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    public int[] getBottomRightXY() {
        return topLeft.getXY();
    }

    public void setBottomRightXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    // Methods to calculate the width and height of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString method to represent the rectangle
    public String toString() {
        return "MyRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + 
               ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}
