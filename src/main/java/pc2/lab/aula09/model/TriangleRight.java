package pc2.lab.aula09.model;

import java.text.DecimalFormat;

public class TriangleRight extends Triangle{

/*
    public TriangleRight(Point origem, int tamanhoLado) {
        origem = new Point(0,0);
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(1,0);
        superior= new Point(1, 2);
    }
*/

    public TriangleRight(Point startPoint, int base, int hight) {
        this.base = base;
        this.hight = hight;
        origem = startPoint;
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(base,0);
        superior = new Point(base,hight);
    }


    @Override
    public double getArea(){
        return (base * hight)/2;
    }
    @Override
    public double getPerimetro(){
        double hypo =  (Math.sqrt((inferiorDireito.getX()*inferiorDireito.getX())+(superior.getY()*superior.getY())));
        return base + hight + hypo;
    }

    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#0.00");
        return "Triangulo Retangulo{\n" +
                "Base => " + base + "\n" +
                "Altura => " + hight + "\n" +
                "Area => " + decimal.format(getArea()) + "\n" +
                "Perimetro => " + decimal.format(getPerimetro())  + "\n" +
                "}\n";
    }
}
