import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Point p1 = new Point(1.0,3.0);
//        System.out.println(p1.x);
        List<Point> tri_points = new ArrayList<>(); // tutaj jest new ArrayList bo List to tylko implementacja
        tri_points.add(new Point(1.0,2.0));
        tri_points.add(new Point(2.0,3.0));
        tri_points.add(new Point(3.0,4.0));
        Polygon triangle = new Polygon(tri_points);
    }
}