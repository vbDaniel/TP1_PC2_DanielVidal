package pc2.lab.aula09.model;

public abstract class Triangle extends FiguraGeometrica{


    protected Point origem;
    protected Point inferiorDireito;
    protected Point inferiorEsquerdo;
    protected Point superior;

    public Triangle() {
        origem = new Point(0,0);
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(0,1);
        superior = new Point(1,2);
    }

    public Point getOrigem() {
        return origem;
    }

    public void setOrigem(Point origem) {
        this.origem = origem;
    }

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
    public abstract double getArea();

    public abstract double getPerimetro();
}
