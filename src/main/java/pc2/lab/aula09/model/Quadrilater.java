package pc2.lab.aula09.model;

public abstract class Quadrilater extends FiguraGeometrica{

    protected Point origem;
    protected Point inferiorEsquerdo;
    protected Point inferiorDireito;
    protected Point superiorDireito;
    protected Point superiorEsquerdo;

    public Quadrilater() {
        origem = new Point(0,0);
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(0,1);
        superiorDireito = new Point(1,2);
        superiorEsquerdo = new Point(1,0);
    }
/*

    public Point getInferiorEsquerdo() {
        return inferiorEsquerdo;
    }

    protected void setInferiorEsquerdo(Point inferiorEsquerdo) {
        this.inferiorEsquerdo = inferiorEsquerdo;
    }

    public Point getInferiorDireito() {
        return inferiorDireito;
    }

    protected void setInferiorDireito(Point inferiorDireito) {
        this.inferiorDireito = inferiorDireito;
    }

    public Point getSuperiorDireito() {
        return superiorDireito;
    }

    protected void setSuperiorDireito(Point superiorDireito) {
        this.superiorDireito = superiorDireito;
    }

    public Point getSuperiorEsquerdo() {
        return superiorEsquerdo;
    }

    protected void setSuperiorEsquerdo(Point superiorEsquerdo) {
        this.superiorEsquerdo = superiorEsquerdo;
    }
*/

    public abstract double getArea();

    public abstract double getPerimetro();
}
