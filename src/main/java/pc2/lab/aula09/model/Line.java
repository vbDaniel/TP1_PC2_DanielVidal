package pc2.lab.aula09.model;

public class Line extends FiguraGeometrica{

    private Point pointInicia;
    private Point pointFinal;

    public Line() {
        pointInicia = new Point(0,0);
        pointFinal = new Point(0, 1);
    }

    public Line(int xInicial, int yInicial, int xFinal, int yFinal) {
        pointInicia = new Point(xInicial,yInicial);
        pointFinal = new Point(xFinal, yFinal);
    }

    public Line(Point pInicial, Point pFinal) {
        this.pointInicia = pInicial;
        this.pointFinal = pFinal;
    }

    public Point getPontoInicia() {
        return pointInicia;
    }

    public void setPontoInicia(Point pointInicia) {
        this.pointInicia = pointInicia;
    }

    public Point getPontoFinal() {
        return pointFinal;
    }

    public void setPontoFinal(Point pointFinal) {
        this.pointFinal = pointFinal;
    }
}
