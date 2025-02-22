package OOP6baitap2;

public class MovablePoint implements Moveable {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() {
        y -= ySpeed;
    }
    public void moveDown() {
        y += ySpeed;
    }
    public void moveLeft() {
        x -= xSpeed;
    }
    public void moveRight() {
        x += xSpeed;
    }
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
    class MovableCircle implements Moveable {
        private int radius;
        private MovablePoint center;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }
        public void moveUp() {
            center.moveUp();
        }
        public void moveDown() {
            center.moveDown();
        }
        public void moveLeft() {
            center.moveLeft();
        }
        public void moveRight() {
            center.moveRight();
        }
        public String toString() {
            return center.toString() + ", radius=" + radius;
        }
    }
}
