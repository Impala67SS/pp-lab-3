package geometry;

public class Main {
    public static void main(String[] args) { 
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(2, 4), 5);
        circles[1] = new ColoredCircle(new Point(2, 4), 5, "green");

            for (Circle circle : circles) {
                 System.out.println("Pole:" + circle.calculateArea());
            

        if (circle instanceof ColoredCircle) { 
            ColoredCircle coloredCircle = (ColoredCircle) circle;
            System.out.println("Kolor:" + coloredCircle.getColor());

        }
        else { System.out.println(); }
        }
        
    }
}
