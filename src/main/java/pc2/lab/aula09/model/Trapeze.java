package pc2.lab.aula09.model;

import java.text.DecimalFormat;

public class Trapeze extends Quadrilater {

    protected Point origem;
    protected double higth;
    protected double bigBase;
    protected double smallBase;
    protected double hipotLeft;
    protected double hipotRight;

//    public Trapeze() {
//        inferior = new Line(0,0,2,0);
//        direita = new Line(2,0,1,1);
//        superior = new Line(1,1,0,1);
//        esquerda = new Line(0,1,0,0);
//    }

    public Trapeze(Point startPoint, int higth, int firstPartBase, int secundPartBase, int thirdPartBase){
        this.higth = higth;
        double bigBase = firstPartBase + secundPartBase + thirdPartBase;
        this.bigBase = bigBase;
        this.smallBase = secundPartBase;
        origem = startPoint;
        inferiorEsquerdo = origem;
        inferiorDireito = new Point( bigBase,higth);
        superiorDireito = new Point(bigBase - thirdPartBase, higth);
        superiorEsquerdo = new Point(firstPartBase, higth);
    }
    public double getHipotLeft(){
        return hipotLeft = (Math.sqrt((superiorEsquerdo.getX()*superiorEsquerdo.getX())+(superiorEsquerdo.getY()*superiorEsquerdo.getY())));
    }
    public double getHipotRight(){
        return hipotRight = (Math.sqrt((superiorDireito.getX()*superiorDireito.getX())+(superiorEsquerdo.getY()*superiorEsquerdo.getY())));
    }

    @Override
    public double getArea(){
        return ((inferiorDireito.getX() * -(superiorEsquerdo.getX()-superiorDireito.getX())* superiorDireito.getY())/2);
    }
    @Override
    public double getPerimetro(){
        return (getHipotLeft() + getHipotRight() + inferiorDireito.getX()) + superiorDireito.getX() - superiorEsquerdo.getX();
    }
    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#0.00");
        return "Trapezio{\n" +
                "Base Maior => " + bigBase + "\n" +
                "Base Menor => " + smallBase + "\n" +
                "Altura => " + higth + "\n" +
                "Lateral Esquerda => " + decimal.format(getHipotLeft()) + "\n" +
                "Lateral Direita => " + decimal.format(getHipotRight()) + "\n" +
                "Area => " + getArea() + "\n" +
                "Perimetro => " + decimal.format(getPerimetro())  + "\n" +
                "}\n" +
                "---------------------------------------\n";
    }
}
