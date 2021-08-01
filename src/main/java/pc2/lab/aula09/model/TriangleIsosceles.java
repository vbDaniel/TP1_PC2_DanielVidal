package pc2.lab.aula09.model;

import java.text.DecimalFormat;

public class TriangleIsosceles extends Triangle{

    public TriangleIsosceles(Point startPoint, int base, int hight) {
        this.base = base;
        this.hight = hight;
        origem = startPoint;
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(base, origem.getY());
        superior= new Point((double) base/2, hight);
    }
    @Override
    public double getHypo(){
        return (Math.sqrt((base*base)+(hight*hight)));
    }
    @Override
    public double getArea(){
        return (base * hight)/2;
    }
    @Override
    public double getPerimetro(){
        return base + getHypo()*2;
    }
    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#0.00");
        return "Triangulo Isoceles{\n" +
                "Base => " + base + "\n" +
                "Altura => " + hight + "\n" +
                "Lados => " +  decimal.format(getHypo()) + "\n" +
                "Area => " + decimal.format(getArea()) + "\n" +
                "Perimetro => " + decimal.format(getPerimetro())  + "\n" +
                "}\n" +
                "---------------------------------------\n";
    }
}
