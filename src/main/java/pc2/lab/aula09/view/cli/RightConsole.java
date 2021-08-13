package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Right;
import pc2.lab.aula09.model.enums.EnumMenuOption;


public class RightConsole extends BasicConsole{

    public Right askRight(){
        int verif = 1;
        Right newRight = null;
        while (verif == 1) {
            Point newPoint = new PointConsole().askPointOrigem();

            Point finalPoint = new PointConsole().askPoint();



            showMsg("----------------------------------------------------------------\n");
            showMsg("Sua reta terá as seguintes dimensoes:\n" +
                    "Ponto Origem \n{ x: " + newPoint.getX() + "\ny: " + newPoint.getY() + "  }\n" +
                    "Ponto Final \n{ x: " + newPoint.getX() + "\ny: " + newPoint.getY() + "  }\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2: ");

            verif = in.nextInt();

            newRight = new Right(newPoint, finalPoint);
        }
        return newRight;
    }

    public EnumMenuOption askMenuRight(MenuConsole menuScreen){

        showMsg("MENU *Reta*: \n" +
                "Digite uma opção: \n" +
                "1 - Novo Reta\n" +
                "2 - Editar Reta(Selecionar Id e Editar)\n" +
                "3 - Listar Reta(Listar Itens do Tipo) \n" +
                "4 - Mostrar a Reta (Listar detalhes de 1 Itens) \n" +
                "5 - Excluir (Excluir Id)\n" +
                "X - Voltar\n");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.NEWSQUARE;
            case "2":
                return EnumMenuOption.EDIT;
            case "3":
                return EnumMenuOption.LIST;
            case "4":
                return EnumMenuOption.SHOW;
            case "5":
                return EnumMenuOption.DELETE;
            case "X":
                return menuScreen.askMenuMakeFig();
            default:
                return EnumMenuOption.END;
        }
    }
}
