package pc2.lab.aula09.model;

public class Point extends FiguraGeometrica{

    private double x;
    private double y;

    private String color;

    public Point() {
        this.x = 0;
        this.y = 0;
        color = "Black";
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return  x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return  y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void desenha(){}

    @Override
    public String toString() {
        return "Ponto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
