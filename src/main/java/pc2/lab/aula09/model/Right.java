package pc2.lab.aula09.model;

public class Right extends Render{

    private int sideRight;
    protected Point startPoint;
    protected Point finalPoint;


    public Right(Point startPoint, Point finalPoint){
        this.startPoint = startPoint;
        this.finalPoint = finalPoint;

    }

    public double getSideRight(){
        return Math. sqrt(Math. pow(finalPoint.getX() - startPoint.getX(), 2) + Math. pow(finalPoint.getY() - startPoint.getY(), 2));
    }

    @Override
    public String toString(){
        return "Reta{\n" +
                "Tamanho da Reta => " + getSideRight() + "\n" +
                "Ponto 1 => {  x: " + startPoint.getX() + " y: " + startPoint.getY() + "}\n" +
                "Ponto 2 => {  x: " + finalPoint.getX() + " y: " + finalPoint.getY() + "}\n" +
                "}\n" +
                "---------------------------------------\n";
    }
    @Override
    public int hashCode() {
        return 7;
    }
}
