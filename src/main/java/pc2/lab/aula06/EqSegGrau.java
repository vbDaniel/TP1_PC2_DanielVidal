package pc2.lab.aula06;

import java.util.Scanner;

public class EqSegGrau {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raizA,raizB,delta;
        int a,b,c;
        while(ler.hasNextInt()){
            a = ler.nextInt();

            b = ler.nextInt();

            c = ler.nextInt();
            if(a == 0){
                System.out.println("Nao e uma equacao de grau 2");
            }else{
                delta = (Math.pow(b,2)-(4*a*c));
                if(delta < 0){
                    System.out.println("Equacao: "+a+"(x2) + "+b+"(x) + "+c);
                    System.out.println("Solucao com 0 raizes reais");
                    System.out.println("X1: Nao existe raiz real");
                }else{
                    raizA = (-b + Math.sqrt(delta))/2;
                    raizB = (-b - Math.sqrt(delta))/2;
                    System.out.println("Equacao: "+a+"(x2) + "+b+"(x) + "+c);
                    if(raizA == raizB){
                        System.out.println("Solucao com 1 raiz real");
                        System.out.println("X1: " +raizA);
                    }else{
                        System.out.println("Solucao com 2 raizes reais");
                        System.out.println("X1: " +raizA);
                        System.out.println("X2: " +raizB);
                    }
                }
            }
        }
    }
}
