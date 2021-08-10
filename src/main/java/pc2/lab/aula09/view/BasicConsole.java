package pc2.lab.aula09.view;

import pc2.lab.aula09.model.enums.EnumMenuOption;


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
public class BasicConsole {


    protected Scanner in;

    public BasicConsole(){
        in = new Scanner(System.in);
    }

    public void showLnMsg(String msg){
        System.out.println(msg);
    }

    public void showMsg(String msg){
        System.out.print(msg);
    }

//    public int askInt(String msg){
//        showMsg(msg);
//        return in.nextInt();
//    }
    public int askInt(){
        return in.nextInt();
    }

//    public boolean hasNextInt(){
//        return in.hasNextInt();
//    }


}
