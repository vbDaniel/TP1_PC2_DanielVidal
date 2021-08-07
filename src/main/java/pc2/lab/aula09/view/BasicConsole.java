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

    public EnumMenuOption askMainMenuOption(){
        //Loop até entregar uma opção válida
        showMsg("Enter a number or letter that matches your wish: \n" +
               
                "1 - Make Figura Geometrica\n" +
                "2 - To Delete\n" +
                "D - To Draw\n" +
                "L - To List\n" +
                "X - To END Paint");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.MAKEFIGURA;
            case "2":
                return EnumMenuOption.DELETE;
            case "D":
                return EnumMenuOption.DRAW;
            case "L":
                return EnumMenuOption.LIST;
            case "X":
                return EnumMenuOption.END;
            default:
                return EnumMenuOption.END;
        }
    }

    public EnumMenuOption askMenuMakeFig(){

        showMsg("Enter a number or letter that matches your wish: \n" +

                "1 - Make Square\n" +
                "2 - Make Rectangle\n" +
                "3 - Make Lozenge\n" +
                "4 - Make Trapeze\n" +
                "5 - Make Circle\n" +
                "6 - Make TriangleRectangle\n" +
                "7 - Make TriangleIsosceles\n" +
                "8 - Make TriangleEquilateral\n" +
                "X - To Back main menu");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.SQUARE;
            case "2":
                return EnumMenuOption.RECTANGLE;
            case "3":
                return EnumMenuOption.LOZENGE;
            case "4":
                return EnumMenuOption.TRAPEZE;
            case "5":
                return EnumMenuOption.CIRCLE;
            case "6":
                return EnumMenuOption.TRIANGLERIGHT;
            case "7":
                return EnumMenuOption.TRIANGLEISOSCELES;
            case "8":
                return EnumMenuOption.TRIANGLEEQUILATERAL;
            case "X":
                return askMainMenuOption();
            default:
                return EnumMenuOption.END;
        }
    }

}
