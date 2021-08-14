package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.enums.EnumMenuOption;

public class PointConsole extends BasicConsole{
    public Point askPoint(){
        showMassage("Digite as Coordenadas de X e Y do ponto CENTRAL desejado.\nX: ");
        int x = in.nextInt();
        showMassage("Y: ");
        int y = in.nextInt();
        Point newPoint = new Point(x, y);
        return newPoint;
    }
    public Point askPointOrigem(){
        showMassage("Digite as Coordenadas de X e Y do ponto ORIGEM de sua figura.\nX: ");
        int x = in.nextInt();
        showMassage("Y: ");
        int y = in.nextInt();
        Point newPoint = new Point(x, y);
        return newPoint;
    }


    public EnumMenuOption askMenuPoint(MenuConsole menuConsole){

        showMassage("MENU *Ponto*: \n" +
                "Digite uma opção: \n" +
                "1 - Novo Ponto\n" +
                "2 - Editar Ponto(Selecionar Id e Editar)\n" +
                "3 - Listar Ponto(Listar Itens do Tipo) \n" +
                "4 - Mostrar o Ponto(Listar detalhes de 1 Itens) \n" +
                "5 - Excluir (Excluir Id)\n" +
                "X - Voltar\n");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.NEWPOINT;
            case "2":
                return EnumMenuOption.EDIT;
            case "3":
                return EnumMenuOption.LIST;
            case "4":
                return EnumMenuOption.SHOW;
            case "5":
                return EnumMenuOption.DELETE;
            case "X":
                return menuConsole.askMainMenuOption();
            default:
                return EnumMenuOption.END;
        }

    }
}
