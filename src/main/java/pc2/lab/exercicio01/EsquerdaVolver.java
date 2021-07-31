package pc2.lab.exercicio01;

import java.util.Scanner;

public class EsquerdaVolver {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numcomands = scn.nextInt();

        while(numcomands!=0) {
            int posicao = 0;
            String command= scn.next() ;
            char[] cadeia = command.toCharArray();

            for (char c : cadeia) {
                if (c == 'E') { // contagem de E's
                    posicao--;
                }
                if (c == 'D') { // contagem de D's
                    posicao++;
                }
            }

            posicao = posicao % 4;
            if (posicao == 0){
                System.out.println("N");
            } else if (posicao == 1){
                System.out.println("L");
            } else if (posicao == 2){
                System.out.println("S");
            } else {
                System.out.println("0");
            }

            numcomands = scn.nextInt();
        }
    }
}