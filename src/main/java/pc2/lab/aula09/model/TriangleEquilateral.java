package pc2.lab.aula09.model;

import java.text.DecimalFormat;

public class TriangleEquilateral extends Triangle{



    public TriangleEquilateral( Point startPoint, int side){
        this.side = side;
        origem = startPoint;
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(side,0);
        superior= new Point((double) side/2, (side*Math.sqrt(3))/2);
    }


    @Override
    public double getArea(){
        return (side * superior.getY())/2;
    }
    @Override
    public double getPerimetro(){
        return inferiorDireito.getX() + superior.getY()*2;
    }

    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#0.00");
        return "Triangulo Equilatero{\n" +
                "Tamanho dos lados => " + side + "\n" +
                "Area => " + decimal.format(getArea()) + "\n" +
                "Perimetro => " + decimal.format(getPerimetro())  + "\n" +
                "}\n";
    }
}
