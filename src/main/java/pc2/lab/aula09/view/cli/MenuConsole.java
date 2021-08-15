package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.IMenuView;

public class MenuConsole extends BasicConsole implements IMenuView {

    public EnumMenuOption askMainMenuOption(){
        //Loop até entregar uma opção válida
        showMassage("\nEnter a number or letter that matches your wish: \n" +

                "R - Renderizaveis\n" +
                "A - To Delete\n" +
                "D - To Draw\n" +
                "S - To Save\n" +
                "C - To Load Save\n" +
                "L - To List\n" +
                "X - To END Paint\n" +
                "------------------------------------------------------\n" +
                "=>");

        String option = in.next();

        switch (option){
            case "R":
                return EnumMenuOption.MAKERENDER;
            case "A":
                return EnumMenuOption.DELETE;
            case "D":
                return EnumMenuOption.DRAW;
            case "S":
                return EnumMenuOption.SAVE;
            case "C":
                return EnumMenuOption.RECOVER;
            case "L":
                return EnumMenuOption.LIST;
            case "X":
                return askMenuMakeFig();
            default:
                return null;
        }
    }

    public EnumMenuOption askMenuMakeFig(){

        showMassage("\nEnter a number or letter that matches your wish or make: \n" +

                "1 - Square\n" +
                "2 - Rectangle\n" +
                "3 - Lozenge\n" +
                "4 - Trapeze\n" +
                "5 - Circle\n" +
                "6 - Triangle\n" +
                "7 - Right\n" +
                "8 - Text\n" +
                "X - To Back main menu\n" +
                "--------------------------------------------------------\n" +
                "=>");

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
                return EnumMenuOption.TRIANGLE;
            case "7":
                return EnumMenuOption.RIGHT;
            case "8":
                return EnumMenuOption.TEXT;
            case "X":
                return EnumMenuOption.BACK;
            default:
                return EnumMenuOption.END;
        }
    }

}
