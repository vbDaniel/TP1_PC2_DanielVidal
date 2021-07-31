package pc2.lab.aula06;

import java.util.Scanner;

public class EqSegGrauOO {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        EqSegGrauModel eq = new EqSegGrauModel();

        while(ler.hasNextInt()){
            eq.a = ler.nextInt();
            eq.b = ler.nextInt();
            eq.c = ler.nextInt();

            //eq.calcDelta();

            if(eq.a == 0){
                System.out.println("Nao e uma equacao de grau 2");
            }else{
                System.out.println("Equacao: "+eq.a+"(x2) + "+eq.b+"(x) + "+eq.c);
                switch (eq.quantasRaizes()){
                    case 0:
                        System.out.println("Solucao com 0 raizes reais");
                        System.out.println("X1: Nao existe raiz real");
                        break;
                    case 1:
                        System.out.println("Solucao com 1 raiz real");
                        System.out.println("X1: " +eq.retornarRaiz1());
                        break;
                    case 2:
                        System.out.println("Solucao com 2 raizes reais");
                        System.out.println("X1: " +eq.retornarRaiz1());
                        System.out.println("X2: " +eq.retornarRaiz2());
                        break;
                }
            }
        }
    }
}
