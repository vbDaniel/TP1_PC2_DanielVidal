package pc2.lab.aula09.model;

public class Square extends Rectangle {

    private int sideSquade;
    protected Point origem;

    public Square(Point startPoint, int sideSquade){
        this.sideSquade = sideSquade;
        this.origem = startPoint;
        this.inferiorEsquerdo = startPoint;
        this.inferiorDireito = new Point(origem.getX(), sideSquade);
        this.superiorDireito = new Point(sideSquade,sideSquade);
        this. superiorEsquerdo = new Point(sideSquade, origem.getY());
    }


/*
    public Square(Point origem, int sideSquade) {
        this.sideSquade = sideSquade;
        this.origem = origem;
        this.setInferiorEsquerdo(origem);

        this.getInferiorEsquerdo().setX(origem.getX()+ sideSquade);
        this.getInferiorEsquerdo().setY(origem.getY());

        this.setInferiorDireito(new Point(origem.getX()+ sideSquade, origem.getY()));

        this.setSuperiorDireito(new Point(origem.getX()+ sideSquade, origem.getY()+ sideSquade));
        this.setSuperiorEsquerdo(new Point(origem.getX(), origem.getY()+ sideSquade));
    }
*/




    public void setOrigem(int tamanhoLado){
        inferiorEsquerdo = new Point(0,0);
        inferiorDireito = new Point(0,tamanhoLado);
        superiorDireito = new Point(tamanhoLado,tamanhoLado);
        superiorEsquerdo = new Point(tamanhoLado,0);
    }


    public double getArea(){
        return sideSquade * sideSquade;
    }

    public double getPerimetro(){
        return sideSquade *4;
    }



    @Override
    public String toString() {
        return "Quadrado{\n" +
                "Tamanho do Lado => " + sideSquade + "\n" +
                "Area => " + getArea() + "\n" +
                "Perimetro => " + getPerimetro() + "\n" +
                '}';
    }


/*
    ARRAYLIST CONTEXT
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return tamanhoLado == square.tamanhoLado;
    }
*/

    @Override
    public int hashCode() {
        return sideSquade;
    }
}
