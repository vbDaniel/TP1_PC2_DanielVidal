package pc2.lab.aula09.model;

public class Square extends Rectangle {

    private int tamanhoLado;

    public Square(){
        this(1);
    }

    public Square(int tamanhoLado){
        this(new Point(0,0), tamanhoLado);
    }

    public Square(Point origem, int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
        this.origem = origem;
        this.setInferiorEsquerdo(origem);

        this.getInferiorEsquerdo().setX(origem.getX()+tamanhoLado);
        this.getInferiorEsquerdo().setY(origem.getY());

        this.setInferiorDireito(new Point(origem.getX()+tamanhoLado, origem.getY()));

        this.setSuperiorDireito(new Point(origem.getX()+tamanhoLado, origem.getY()+tamanhoLado));
        this.setSuperiorEsquerdo(new Point(origem.getX(), origem.getY()+tamanhoLado));
    }

    public void setTamanho(int tamanhoLado){
        inferiorEsquerdo = new Point(0,0);
        inferiorDireito = new Point(0,tamanhoLado);
        superiorDireito = new Point(tamanhoLado,tamanhoLado);
        superiorEsquerdo = new Point(tamanhoLado,0);
    }

    public void setOrigem(int tamanhoLado){
        inferiorEsquerdo = new Point(0,0);
        inferiorDireito = new Point(0,tamanhoLado);
        superiorDireito = new Point(tamanhoLado,tamanhoLado);
        superiorEsquerdo = new Point(tamanhoLado,0);
    }

    @Override
    public double getArea(){
        return tamanhoLado*tamanhoLado;
    }

    public double getPerimetro(){
        return tamanhoLado*4;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "tamanhoLado=" + tamanhoLado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return tamanhoLado == square.tamanhoLado;
    }

    @Override
    public int hashCode() {
        return tamanhoLado;
    }
}
