package pl.sda.dystans;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void distance(Point point){
        System.out.println (this.x);
        System.out.println (this.y);

        System.out.println (point.getX ());
        System.out.println (point.getY ());

        Math.sqrt (Math.pow (( x - point.getX ( )), 2) + Math.pow ((y - point.getY ( )), 2));
    }

    }

