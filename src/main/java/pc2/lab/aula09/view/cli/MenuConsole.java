package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.model.enums.EnumMenuOption;

public class MenuConsole extends BasicConsole {

    public EnumMenuOption askMainMenuOption(){
        //Loop até entregar uma opção válida
        showMsg("\nEnter a number or letter that matches your wish: \n" +

                "1 - Renderizaveis\n" +
                "2 - To Delete\n" +
                "D - To Draw\n" +
                "L - To List\n" +
                "X - To END Paint\n" +
                "------------------------------------------------------\n" +
                "=>");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.MAKERENDER;
            case "2":
                return EnumMenuOption.DELETE;
            case "D":
                return EnumMenuOption.DRAW;
            case "L":
                return EnumMenuOption.LIST;
            case "X":
                return askMenuMakeFig();
            default:
                return EnumMenuOption.END;
        }
    }

    public EnumMenuOption askMenuMakeFig(){

        showMsg("\nEnter a number or letter that matches your wish or make: \n" +

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