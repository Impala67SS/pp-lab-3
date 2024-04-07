package geometry;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(10, 10);
        ColoredCircle coloredCircle = new ColoredCircle(center, 10, "green");
        
    System.out.println("Środek: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
    System.out.println("Promień: " + coloredCircle.getRadius());
    System.out.println("Obwód: " + coloredCircle.calculatePerimeter());
    System.out.println("Kolor: " + coloredCircle.getColor());
        
    }
}