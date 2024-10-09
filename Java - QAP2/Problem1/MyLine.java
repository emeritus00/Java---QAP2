public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructor using coordinates
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Constructor using MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin(){
        return this.begin;
    }

    public void setBegin(MyPoint begin){
        this.begin = begin;
    }

    public MyPoint getEnd(){
        return this.end;
    }

    public void setEnd(MyPoint end){
        this.end = end;
    }

    public int getBeginX(){
        return this.begin.getX();
    }

    public void setBeginX(int x){
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX(){
        return end.getX();
    }

    public void setEndX(int x){
        end.setX(x);
    }

    public int getEndY(){
        return end.getY();
    }

    public void setEndY(int y){
        end.setY(y);
    }

    public int[] getBeginXY(){
        return this.begin.getXY();
    }

    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
    }

    public int[] getEndXY(){
        return this.end.getXY();
    }

    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }

    // Method to calculate the length
    public double getLength(){
        return begin.distance(end);
    }

    double gradient = 0;
    // Method to calculate the gradient
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        gradient = Math.atan2(yDiff, xDiff);
        return Math.round(gradient * 100.0) / 100.0;
    }

    // toString method
    public String toString() {
        return "MyLine [begin=" + begin + ", end=" + end + "]";
    }

}