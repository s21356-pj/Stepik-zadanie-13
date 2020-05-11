import java.util.ArrayList;
import java.util.Collections;

class Circle implements Comparable<Circle> {
    private int radius=0;
    private String color;

    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String col) {
        this.color = col;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public int compareTo(Circle b){
        if(radius == b.radius){
            return 0;
        }else if(radius > b.radius){
            return 1;
        }else {
            return -1;
        }
    }
}