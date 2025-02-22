package OOP7baitap;
import java.util.ArrayList;
import java.util.List;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
class PolyLine {
    private List<Point> points = new ArrayList<>();

    public PolyLine() {
    }
    public PolyLine(List<Point> points) {
        this.points = new ArrayList<>(points);
    }
    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }
    public void appendPoint(Point point) {
        points.add(point);
    }
    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).distance(points.get(i + 1));
        }
        return length;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Point point : points) {
            sb.append(point.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}