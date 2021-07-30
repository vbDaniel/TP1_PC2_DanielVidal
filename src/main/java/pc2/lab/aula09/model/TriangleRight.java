package pc2.lab.aula09.model;

public class TriangleRight extends Triangle{



    public TriangleRight(Point origem, int tamanhoLado) {
        origem = new Point(0,0);
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(1,0);
        superior= new Point(1, 2);
    }

    public TriangleRight(int base, int hight) {
        origem = new Point(0,0);
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(base,0);
        superior = new Point(base,hight);
    }


    @Override
    public double getArea(){
        return (inferiorDireito.getX() * superior.getY())/2;
    }
    @Override
    public double getPerimetro(){
        double hypo =  (Math.sqrt((inferiorDireito.getX()*inferiorDireito.getX())+(superior.getY()*superior.getY())));
        return inferiorDireito.getX() + superior.getY() + hypo;
    }
}
