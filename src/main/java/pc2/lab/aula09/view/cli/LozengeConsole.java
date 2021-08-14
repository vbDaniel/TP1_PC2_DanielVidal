package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.model.Lozenge;
import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ILozengeView;
import pc2.lab.aula09.view.Iview.IMenuView;

public class LozengeConsole extends BasicConsole implements ILozengeView {

    public Lozenge askLozenge(){

        int verif = 1;
        Lozenge newLozenge = null;
        while (verif == 1) {
            Point newPoint = new PointConsole().askPointOrigem();

            showMassage("Digite um inteiro para a DIAGONAL maior de seu Losango: ");
            int newbigDiagonal = in.nextInt();
            showMassage("Digite um inteiro para a DIAGONAL menor de seu Losango: ");
            int newsmallDiagonal = in.nextInt();


            showMassage("----------------------------------------------------------------\n");
            showMassage("Seu Losango terá as seguintes dimensoes:\n" +
                    "Diagonal maior: " + newbigDiagonal + "\n" +
                    "Diagonal menor: " + newsmallDiagonal + "\n" +
                    "Ponto Origem => \nx: " + newPoint.getX() + "\ny: " + newPoint.getY()+ "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2: ");
                    verif = in.nextInt();

            newLozenge = new Lozenge(newPoint, newbigDiagonal,newsmallDiagonal);
        }


        return newLozenge;
    }
    public EnumMenuOption askMenuLozenge(IMenuView menuConsole){

        showMassage("MENU *Losango*: \n" +
                "Digite uma opção: \n" +
                "1 - Novo Losango\n" +
                "2 - Editar Losango(Selecionar Id e Editar)\n" +
                "3 - Listar Losangos(Listar Itens do Tipo) \n" +
                "4 - Mostrar o Losango (Listar detalhes de 1 Itens) \n" +
                "5 - Excluir (Excluir Id)\n" +
                "X - Voltar\n");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.NEWLOZENGE;
            case "2":
                return EnumMenuOption.EDIT;
            case "3":
                return EnumMenuOption.LIST;
            case "4":
                return EnumMenuOption.SHOW;
            case "5":
                return EnumMenuOption.DELETE;
            case "X":
                return menuConsole.askMenuMakeFig();
            default:
                return EnumMenuOption.END;
        }
    }
}
