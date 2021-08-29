package pc2.lab.aula09.model;

public class FiguraGeometrica extends Render{

    protected Point origem;
    protected Point inferiorDireito;
    protected Point inferiorEsquerdo;
    protected Point superior;
    protected double base;
    protected double hight;
    protected  double side;

    public double getArea(){
        return -1;
    }
    public double getPerimetro(){
        return -1;
    }

    @Override
    public int hashCode() {
        return 10;
    }
    @Override
    public String toString() {
        return "Figura";
    }
}
