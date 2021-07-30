package pc2.lab.aula09.model;

public class TriangleEquilateral extends Triangle{



    public TriangleEquilateral(int side){
        origem = new Point(0,0);
        inferiorEsquerdo = origem;
        inferiorDireito = new Point(side,0);
        superior= new Point(side/2, );
    }



    @Override
    public double getArea(){
        return (inferiorDireito.getX() * superior.getY())/2;
    }
    @Override
    public double getPerimetro(){
        return inferiorDireito.getX() + superior.getY()*2;
    }
}
