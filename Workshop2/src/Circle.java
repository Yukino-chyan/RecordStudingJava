public class Circle {
    private double radius;
    private double x,y;
    public Circle (double radius) {
        this.radius = radius;
        this.x=0; this.y=0;
    }
    public Circle (double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public Circle(){
        this.radius=1;
        this.x=0;
        this.y=0;
    }
    public String toString() {
        return "Circle[radius=" + radius + ", x=" + x + ", y=" + y + "]";
    }
    public boolean equals(Circle obj) {
        return Double.compare(obj.radius, radius) == 0 &&
                Double.compare(obj.x, x) == 0 &&
                Double.compare(obj.y, y) == 0;
    }
}
