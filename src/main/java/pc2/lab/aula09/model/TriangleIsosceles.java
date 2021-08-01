package pc2.lab.aula09.model;

import java.text.DecimalFormat;

public class TriangleIsosceles extends Triangle{

    public TriangleIsosceles(Point startPoint, int base, int hight) {
        this.base = base;
        this.hight = hight;
        origem = startPoint;
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(base,0);
        superior= new Point(base/2, hight);
    }

    @Override
    public double getArea(){
        return (base * hight)/2;
    }
    @Override
    public double getPerimetro(){
        return base + hight*2;
    }
    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#0.00");
        return "Triangulo Isoceles{\n" +
                "Base => " + base + "\n" +
                "Altura => " + hight + "\n" +
                "Area => " + decimal.format(getArea()) + "\n" +
                "Perimetro => " + decimal.format(getPerimetro())  + "\n" +
                "}\n";
    }
}
