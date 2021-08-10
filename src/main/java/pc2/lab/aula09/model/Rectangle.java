package pc2.lab.aula09.model;

public class Rectangle extends Quadrilater {

    protected Point origem;
    protected int base;
    protected int hight;
    public Rectangle() {
        this(new Point(),1, 2);
    }

    public Rectangle(Point starPoint, int base, int hight) {
        this.hight = hight;
        this.base = base;
        origem = starPoint;
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(base,origem.getY());
        superiorDireito = new Point(base,hight);
        superiorEsquerdo = new Point(origem.getY(), hight);
    }

/*

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
*/
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
        return "Retangulo{\n" +
                "Altura => " + hight + "\n" +
                "Base => " + base + "\n" +
                "Area => " + getArea() + "\n" +
                "Perimetro => " + getPerimetro() + "\n" +
                "}\n" +
                "---------------------------------------\n";
    }
    @Override
    public int hashCode() {
        return 2;
    }
}
