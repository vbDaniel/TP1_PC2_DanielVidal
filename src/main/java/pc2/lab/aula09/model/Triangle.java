package pc2.lab.aula09.model;
/**
 * A classe abstrata que é a mãe dos outros Tringulos;
 *
 * @author Daniel Vidal
 * @version CefetPaint 1.0
 *
 */

public abstract class Triangle extends FiguraGeometrica{


    protected Point origem;
    protected Point inferiorDireito;
    protected Point inferiorEsquerdo;
    protected Point superior;
    protected double base;
    protected double hight;
    protected  double side;
    public Triangle() {

    }


    public Point getOrigem() {
        return origem;
    }

    public void setOrigem(Point origem) {
        this.origem = origem;
    }
/*

    public Point getInferiorDireito() {
        return inferiorDireito;
    }

    public void setInferiorDireito(Point inferiorDireito) {
        this.inferiorDireito = inferiorDireito;
    }

    public Point getInferiorEsquerdo() {
        return inferiorEsquerdo;
    }

    public void setInferiorEsquerdo(Point inferiorEsquerdo) {
        this.inferiorEsquerdo = inferiorEsquerdo;
    }

    public Point getSuperior() {
        return superior;
    }

    public void setSuperior(Point superior) {
        this.superior = superior;
    }
*/

    public abstract double getHypo();

    public abstract double getArea();

    public abstract double getPerimetro();

    @Override
    public int hashCode() {
        return 6;
    }
}
