package pc2.lab.aula09.view.gui;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Rectangle;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.IRectangleView;

public class RectangleConsole extends MenuConsole implements IRectangleView {

    public Rectangle askRectangle(){

        int verif = 1;
        Rectangle newRectangle = null;
        while (verif == 1) {
            Point newPoint = new PointConsole().askPointOrigem();

            showMassage("Digite um inteiro para o tamanho da base do Retangulo:");
            int newBase  = in.nextInt();
            showMassage("Digite um inteiro para o tamanho da altura do Retangulo:");
            int newHight = in.nextInt();


            showMassage("----------------------------------------------------------------\n");
            showMassage("Seu Retangulo terá as seguintes dimensoes:\n" +
                    "Base: " + newBase+ "\n" +
                    "Altura: " + newHight + "\n" +
                    "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY() + "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2: ");
                    verif = in.nextInt();


            newRectangle = new Rectangle(newPoint, newBase, newHight);
        }
        return newRectangle;
    }

    public EnumMenuOption askMenuRectangle(){

        showMassage("MENU *Rectangle*: \n" +
                "Digite uma opção: \n" +
                "1 - Novo Retangulo\n" +
                "2 - Editar Retangulo(Selecionar Id e Editar)\n" +
                "3 - Listar Retangulo(Listar Itens do Tipo) \n" +
                "4 - Mostrar o Retangulo(Listar detalhes de 1 Itens) \n" +
                "5 - Excluir (Excluir Id)\n" +
                "X - Voltar\n");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.CREATE;
            case "2":
                return EnumMenuOption.EDIT;
            case "3":
                return EnumMenuOption.LIST;
            case "4":
                return EnumMenuOption.SHOW;
            case "5":
                return EnumMenuOption.DELETE;
            case "X":
                return askMenuMakeFig();
            default:
                return EnumMenuOption.END;
        }

    }
}
