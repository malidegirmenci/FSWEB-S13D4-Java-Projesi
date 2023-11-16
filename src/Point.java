public class Point {
    private  int x;
    private  int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(x * x + y * y);
    }
    public double distance(Point p){
        int dx = x - p.getX();
        int dy = y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(int a, int b){
        int dx = x - a;
        int dy = y - b;
        return Math.sqrt(dx * dx + dy * dy);
    }

}
