package pc2.lab.aula09.model;

public class Trapeze extends Quadrilater {

    private Point superior;
    private Point inferior;
    private Point direita;
    private Point esquerda;

//    public Trapeze() {
//        inferior = new Line(0,0,2,0);
//        direita = new Line(2,0,1,1);
//        superior = new Line(1,1,0,1);
//        esquerda = new Line(0,1,0,0);
//    }

    public Trapeze(int higth, int firstPartBase, int secundPartBase, int thirdPartBase){
        double newX = firstPartBase + secundPartBase + thirdPartBase;
        origem = new Point(0,0);
        inferiorDireito = new Point( newX,higth);
        superiorDireito = new Point(newX - thirdPartBase, higth);
        superiorEsquerdo = new Point(firstPartBase, higth);
    }

    // TEM QUE FAZER

    @Override
    public double getArea(){
        return ((inferiorDireito.getX() * (superiorEsquerdo.getX()-superiorDireito.getX())* superiorDireito.getY())/2);
    }
    @Override
    public double getPerimetro(){
        double hypoLeft =  (Math.sqrt((superiorEsquerdo.getX()*superiorEsquerdo.getX())+(superiorEsquerdo.getY()*superiorEsquerdo.getY())));
        double hypoRight =  (Math.sqrt((superiorDireito.getX()*superiorDireito.getX())+(superiorEsquerdo.getY()*superiorEsquerdo.getY())));
        return hypoLeft + hypoRight + inferiorDireito.getX() + (superiorEsquerdo.getX() - superiorDireito.getX());
    }
}
