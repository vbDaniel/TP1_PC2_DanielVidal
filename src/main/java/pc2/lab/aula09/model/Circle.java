package pc2.lab.aula09.model;

import java.text.DecimalFormat;
/**
 * A classe que instancia os objetos Circulos;
 *
 * @author Daniel Vidal
 * @version CefetPaint 1.0
 *
 */
public class Circle extends FiguraGeometrica{

    protected Point origem;
    protected Point pointCircle;
    protected double radius;

    public Circle(Point centralPoint, int radius,int manyPoint) {
        this.origem = centralPoint;
        this.radius = radius;
        double distance = ((2 * Math.PI) / manyPoint);

        for (int i = 0; i < manyPoint; i++) {
            double cos = Math.cos(i * distance);
            double sin = Math.sin(i * distance);

            int x = (int) ( cos * radius + origem.getX());
            int y = (int) ( sin * radius + origem.getY());

            this.pointCircle = new Point( x, y);
        }
    }
    public double getDiameter(){
        return radius * 2;
    }
    @Override
    public double getArea(){
        return  Math.PI*(radius * radius);
    }
    @Override
    public double getPerimetro(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#0.00");
        return "Circulo{\n" +
                "Ponto Central =>  x: " + pointCircle.getX() + " / y: " + pointCircle.getY() + "\n" +
                "Raio => " + radius + "\n" +
                "Diametro => " + getDiameter() + "\n" +
                "Area => " + decimal.format(getArea()) + "\n" +
                "Circunferencia => " + decimal.format(getPerimetro())  + "\n" +
                "}\n" +
                "---------------------------------------\n";
    }
}
