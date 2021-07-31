package pc2.lab.exercicio01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class BotasPerdidas {

    public static void main(String[] args) {

        String baseDir = "/dados/disciplina/pw/pc2-2021-1/src/main/java/pc2/lab/exercicio01/testebotas/";
        String prefixInFile = "teste0";
        String outFile = "teste01.out";
        Scanner in = null;

        File file = null;

        for (int testIndice = 1; testIndice <=2; testIndice++) {

            try {
                file = new File(baseDir + prefixInFile + testIndice + ".in");
                in = new Scanner(file);
            } catch (Exception e) {
                System.out.println("Algo Aconteceu de errado ao ler o arquivo e agora será usado o teclado");
                in = new Scanner(System.in);
                return;
            }

            while (in.hasNextInt()) {
                int numBotas = in.nextInt();

                for (int i = 0; i < numBotas; i++) {
                    int numPar = in.nextInt();
                    String pe = in.next();
                    //System.out.println("Li uma Bota");
                    System.out.println(numPar + " " + pe);
                }

            }
        }
    }
}
