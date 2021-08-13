package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Square;
import pc2.lab.aula09.model.enums.EnumMenuOption;

public class SquareConsole extends BasicConsole{

    public Square askSquare(){
        int verif = 1;
        Square newSquare = null;
        while (verif == 1) {
            Point newPoint = new PointConsole().askPointOrigem();

            showMsg("Digite um inteiro para o tamanho do lado do quadrado: ");
            int newSide  = in.nextInt();



            showMsg("----------------------------------------------------------------\n");
            showMsg("Seu Quadrado terá as seguintes dimensoes:\n" +
                    "Tamanho: " + newSide + "\n"+
                    "Ponto Origem: \nx: " + newPoint.getX() + "\ny: " + newPoint.getY() + "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2: ");

            verif = in.nextInt();


            newSquare = new Square(newPoint, newSide);
        }
        return newSquare;
    }


    public EnumMenuOption askMenuSquare(MenuConsole menuScreen){

        showMsg("MENU *Quadrado*: \n" +
                "Digite uma opção: \n" +
                "1 - Novo Quadrado\n" +
                "2 - Editar Quadrados(Selecionar Id e Editar)\n" +
                "3 - Listar Quadrados(Listar Itens do Tipo) \n" +
                "4 - Mostrar o quadrado (Listar detalhes de 1 Itens) \n" +
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
