package pc2.lab.aula09.model;

public class TriangleIsosceles extends Triangle{

    public TriangleIsosceles(int base, int hight) {
        origem = new Point(0,0);
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(base,0);
        superior= new Point(base/2, hight);
    }

    @Override
    public double getArea(){
        return (inferiorDireito.getX() * superior.getY())/2;
    }
    @Override
    public double getPerimetro(){
        return inferiorDireito.getX() + superior.getY()*2;
    }
}
