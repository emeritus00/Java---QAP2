package Problem2;

public class MyPoint{
    private int x = 0;
    private int y = 0;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }
    

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
      return ("(" + this.x + ", " + this.y + ")");
    }

    public double distance(int x, int y) {
        int xdiff = this.x - x;
        int ydiff = this.y - y;

        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public double distance(MyPoint object) {
        int xdiff = this.x - object.x;
        int ydiff = this.y - object.y;

        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public double distance() {
        int xdiff = this.x - 0;
        int ydiff = this.y - 0;

        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }
    
}