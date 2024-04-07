package Zad2;
public class Main {
    public static void main(String[] args) {
        Point center = new Point(10, 10);
        Circle circle = new Circle(center, 9.0);

        System.out.println("Środek: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.calculatePerimeter());
        
    }
}