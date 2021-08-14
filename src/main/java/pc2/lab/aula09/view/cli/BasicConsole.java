package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.view.Iview.IBasicView;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A classe base de todos os Console e da interação com o usuário, todas são extenções dessa;
 *
 * Possuem alguns dos metódos de Scanner e Sout;
 *
 * @author Daniel Vidal
 * @version CefetPaint 1.0
 *
 */
public class BasicConsole implements IBasicView {


    protected Scanner in;

    public BasicConsole(){
        in = new Scanner(System.in);
    }

    @Override
    public void showLineMessage(String msg){
        System.out.println(msg);
    }

    @Override
    public void showMassage(String msg){
        System.out.print(msg);
    }

    @Override
    public int askInt(String question) {
        boolean wrong;
        int x = 0;
        do {
            try {
                showLineMessage(question);
                x = in.nextInt();
                wrong = false;
            } catch (InputMismatchException ex) {
                in.next();// Descartar o valor digitado incorretamente
                showMassage("\n*****ERRO******\nValor Digitado Inválido Tente novamente:\n");
                wrong = true;
            }
        }
        while (wrong);

        return x;
    }

    @Override
    public int askInt(){
        return in.nextInt();
    }

    @Override
    public double askDouble(String question) {
        boolean wrong;
        double x = 0;
        do {
            try {
                showLineMessage(question);
                x = in.nextDouble();
                wrong = false;
            } catch (InputMismatchException ex) {
                in.next();// Descartar o valor digitado incorretamente
                showMassage("\n*****ERRO******\nValor Digitado Inválido Tente novamente:\n");
                wrong = true;
            }
        }
        while (wrong);

        return x;
    }

    @Override
    public double askDouble() {
        return 0;
    }

    @Override
    public boolean hasNextInt(){
        return in.hasNextInt();
    }


}
