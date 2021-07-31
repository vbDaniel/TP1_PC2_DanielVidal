package pc2.lab.aula07;

public class EqSegundoGrau {

    private int a = 1;
    private int b;
    private int c;

    /**
     * Construtor padrão com a = 1, b = 0 e c = 0 (X²)
     * @since 1.0
     */
    public EqSegundoGrau(){
        this(1,0,0);
    }

    public EqSegundoGrau(int a){
        this(a,0,0);
    }
    public EqSegundoGrau(int a, int b){
        this(a,b,0);
    }

    public EqSegundoGrau(int a, int b, int c){
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(a != 0) {
            this.a = a;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private double calcDelta(){
        return (this.b * b) - (4 * a * c);
    }

    public boolean temRaizes(){
        return calcDelta() < 0;
    }

    public double getRootOne(){
        return (-b + Math.sqrt(calcDelta()))/( 2 * a);
    }

    public double getRootTwo(){
        return (-b - Math.sqrt(calcDelta()))/( 2 * a);
    }

    /**
     * Função que retorna quantas Raízes
     * @return 0 em caso de nada, 1 em caso de 1 cais dadasdasda
     */
    public int quantasRaizes(){
        if(calcDelta() > 0){
            return 2;
        }if (calcDelta() == 0){
            return 1;
        }else{
            return 0;
        }
    }


}
