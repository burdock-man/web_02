package a1127.shape;

public class Triangle extends Shape{

    double width, height;

    public double getWidth() {return width;}
    public void setWidth(double width) {this.width = width;}
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    public Triangle() {
        this(0, 0);
    }
    
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height / 2;
    }

    @Override
    double round() {
        return width * 3;
    }

    @Override
    public String toString() {
        return "Triangle [width=" + width + ", height=" + height + "]";
    }
}