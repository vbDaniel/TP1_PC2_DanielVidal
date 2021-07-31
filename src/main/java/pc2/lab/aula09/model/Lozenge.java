package pc2.lab.aula09.model;

public class Lozenge extends Quadrilater {

    protected Point esquerdo;
    protected Point inferior;
    protected Point direito;
    protected Point superior;

    public Lozenge(int bigDiagonal, int smallDiagonal) {
        origem = new Point(0,0);
        esquerdo = origem;
        inferior = new Point(bigDiagonal/2,0);
        direito = new Point(bigDiagonal, smallDiagonal/2);
        superior = new Point(bigDiagonal/2,smallDiagonal);
    }
    @Override
    public double getArea(){
        return (direito.getX() * superiorDireito.getY())/2;
    }
    @Override
    public double getPerimetro(){
        double hipot =  (Math.sqrt((((direito.getX()/2)*(direito.getX())/2))+((superiorDireito.getY()/2)*(superiorDireito.getY()/2))));
        return hipot*4;
    }
}
