package pc2.lab.aula07;

import java.util.Scanner;

public class EqSegGrauOO {

    public static void main(String[] args) {
        //BasicConsole tela = new BasicConsole();
        BasicWindow tela = new BasicWindow();
        EqSegundoGrau eq = new EqSegundoGrau();

        //EqSegundoGrau eq1 = new EqSegundoGrau(1, 2, 4);

        //while(tela.hasNextInt()){
            int abb = tela.askInt();
            eq.setA(abb);
            eq.setB(tela.askInt());
            eq.setC(tela.askInt());

            //eq.calcDelta();   Model View Controller

            if(eq.getA() == 0){
                tela.showLnMsg("Nao e uma equacao de grau 2");
            }else{
                tela.showLnMsg("Equacao: "+eq.getA()+"(x2) + "+eq.getB()+"(x) + "+eq.getC());
                switch (eq.quantasRaizes()){
                    case 0:
                        tela.showLnMsg("Solucao com 0 raizes reais \n+" +
                                       "X1: Nao existe raiz real");
                        break;
                    case 1:
                        tela.showLnMsg("Solucao com 1 raiz real \n" +
                                       "X1: "+eq.getRootOne());
                        break;
                    case 2:
                        tela.showLnMsg("Solucao com 2 raizes reais \n" +
                                "X1: "+eq.getRootOne() + "\n" +
                                "X2: "+eq.getRootTwo());
                        break;
                }
            }
        //}
    }
}
