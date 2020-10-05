class Circle {
    private double x, y;
    private double d;

    public Circle (double x, double y, double diameter) {
        this.x = x;
        this.y = y;
        this.d = diameter;
    }

    public double getX() {
        return x;
    }

    public void setX(double xNew) {
        x += xNew;
    }

    public double getY() {
        return y;
    }

    public void setY(double yNew)
    {
        y += yNew;
    }

    public double getD()
    {
        return d;
    }

    public void setD(double dNew)
    {
        d *= dNew;
    }


}

class TestCircle {
    public static void main (String[] args) {
        Circle c = new Circle(1.24, 2.83, 12.7);
        System.out.println("x="+c.getX()+" y="+c.getY()+" r="+c.getD());
        c.setD(1.37);
        c.setX(.65);
        System.out.println("x="+c.getX()+" y="+c.getY()+" r="+c.getD());
    }
}