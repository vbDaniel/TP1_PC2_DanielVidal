package pc2.lab.aula06;

public class EqSegGrauModel {

    int a;
    int b;
    int c;

    private double calcDelta(){
        return (this.b * b) - (4 * a * c);
    }

    boolean temRaizes(){
        return calcDelta() < 0;
    }

    double retornarRaiz1(){
        return (-b + Math.sqrt(calcDelta()))/( 2 * a);
    }

    double retornarRaiz2(){
        return (-b - Math.sqrt(calcDelta()))/( 2 * a);
    }

    /**
     * Função que retorna quantas Raízes
     * @return 0 em caso de nada, 1 em caso de 1 cais dadasdasda
     */
    int quantasRaizes(){
        if(calcDelta() > 0){
            return 2;
        }if (calcDelta() == 0){
            return 1;
        }else{
            return 0;
        }
    }


}
