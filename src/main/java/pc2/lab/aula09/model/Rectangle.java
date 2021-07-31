package pc2.lab.aula09.model;

public class Rectangle extends Quadrilater {

    public Rectangle() {
        this(1, 2);
    }

    public Rectangle(int base, int altura) {
        inferiorEsquerdo = new Point(0,0);
        inferiorDireito = new Point(base,0);
        superiorDireito = new Point(base,altura);
        superiorEsquerdo = new Point(0,altura);
    }


    public Point getInferiorEsquerdo() {
        return inferiorEsquerdo;
    }

    public void setInferiorEsquerdo(Point inferiorEsquerdo) {
        this.inferiorEsquerdo = inferiorEsquerdo;
    }

    public Point getInferiorDireito() {
        return inferiorDireito;
    }

    public void setInferiorDireito(Point inferiorDireito) {
        this.inferiorDireito = inferiorDireito;
    }

    public Point getSuperiorDireito() {
        return superiorDireito;
    }

    public void setSuperiorDireito(Point superiorDireito) {
        this.superiorDireito = superiorDireito;
    }

    public Point getSuperiorEsquerdo() {
        return superiorEsquerdo;
    }

    public void setSuperiorEsquerdo(Point superiorEsquerdo) {
        this.superiorEsquerdo = superiorEsquerdo;
    }
    @Override
    public double getArea(){
        return superiorDireito.getX() * superiorDireito.getY();
    }
    @Override
    public double getPerimetro(){
        return superiorDireito.getX()*2 + superiorDireito.getY()*2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "origem=" + origem +
                '}';
    }
}
