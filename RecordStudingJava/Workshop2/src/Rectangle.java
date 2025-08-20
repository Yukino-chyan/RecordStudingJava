public class Rectangle {
    private double left,top,width,height;
    public Rectangle(double left,double top,double width,double height){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=height;
    }
    public String toString(){
        return "Rectangle[left=" +  left + ", top=" + top + ", width=" + width + ", height=" + height + "]";
    }
    public boolean equal(Rectangle rectangle){
        return rectangle.left == this.left && rectangle.top == this.top && rectangle.width == this.width && rectangle.height == this.height;
    }
}
