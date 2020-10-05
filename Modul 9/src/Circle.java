class Circle {
    double x, y;
    double r;
    public Circle (double x, double y, double radius) { this.x = x;
        this.y = y;
        this.r = radius;
    }
}

class TestCircle {
    public static void main (String[] args) {
        Circle c = new Circle(1.24, 2.83, 12.7);
        System.out.println("x="+c.x+" y="+c.y+" r="+c.r);
        c.r *= 1.37;
        c.x += 0.65;
        System.out.println("x="+c.x+" y="+c.y+" r="+c.r);
    }
}