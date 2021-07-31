package pc2.lab.aula09.model;

public class Circle extends FiguraGeometrica{

    protected Point origem;
    protected Point radiusFirst;
    protected Point pointCircle;

    public Circle(Point centralPoint, int radius,int manyPoint) {
        origem = centralPoint;
        radiusFirst = new Point(origem.getX(), radius);
        double distance = ((2 * Math.PI) / manyPoint);

        for (int i = 0; i < manyPoint; i++) {
            double cos = Math.cos(i * distance);
            double sin = Math.sin(i * distance);

            int x = (int) ( cos * radius + origem.getX());
            int y = (int) ( sin * radius + origem.getY());

            pointCircle = new Point( x, y);
        }
    }

    @Override
    public double getArea(){
        return (int) Math.PI*(radiusFirst.getY()* radiusFirst.getY());
    }
    @Override
    public double getPerimetro(){
        return 2 * Math.PI * radiusFirst.getY();
    }
}
