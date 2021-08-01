package pc2.lab.aula09.model;

import java.text.DecimalFormat;

public class Lozenge extends Quadrilater {

    protected Point esquerdo;
    protected Point inferior;
    protected Point direito;
    protected Point superior;
    protected Point origem;
    protected double hipot;
    protected double bigDiagonal;
    protected double smallDiagonal;
    public Lozenge(Point starPoint,int bigDiagonal, int smallDiagonal) {
        this.bigDiagonal = bigDiagonal;
        this.smallDiagonal = smallDiagonal;
        origem = starPoint;
        esquerdo = origem;
        inferior = new Point((double) bigDiagonal/2, origem.getY());
        direito = new Point(bigDiagonal, (double) smallDiagonal/2);
        superior = new Point((double) bigDiagonal/2,smallDiagonal);
    }
    @Override
    public double getArea(){
        return (direito.getX() * superiorDireito.getY())/2;
    }

    public double getHipot(){
       return hipot =  (Math.sqrt((((direito.getX()/2)*(direito.getX())/2))+((superiorDireito.getY()/2)*(superiorDireito.getY()/2))));
    }
    @Override
    public double getPerimetro(){
        return getHipot()*4;
    }

    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#0.00");
        return "Losango{\n" +
                "Tamanho do Lado => " + decimal.format(getHipot())  + "\n" +
                "Diagonal Maior => " + bigDiagonal + "\n" +
                "Diagonal Menor => " + smallDiagonal + "\n" +
                "Area => " + getArea() + "\n" +
                "Perimetro => " + decimal.format(getPerimetro())  + "\n" +
                "}\n" +
                "---------------------------------------\n";
    }
}
