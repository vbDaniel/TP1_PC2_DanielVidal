package pc2.lab.aula09.view.gui;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Text;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.cli.BasicConsole;

public class TextGui extends BasicConsole {

    public Text askText(){
        int verif = 1;

        Text newText = null;
        
        while (verif == 1) {
            Point newPoint = new PointGui().askPointOrigem();

            showMsg("Digite o texto que deseja renderizar:");
            String newString  = in.next();

            showMsg("----------------------------------------------------------------\n");
            showMsg("Seu texto será:\n" +
                    "=> " + newString + "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2: ");
            verif = in.nextInt();


            newText = new Text(newPoint, newString);
        }
        return newText;
    }


    public EnumMenuOption askMenuText(MenuGui menuConsole){

        showMsg("MENU *Texto*: \n" +
                "Digite uma opção: \n" +
                "1 - Novo Texto\n" +
                "2 - Editar Texto(Selecionar Id e Editar)\n" +
                "3 - Listar Textos(Listar Itens do Tipo) \n" +
                "4 - Mostrar o Texto(Listar detalhes de 1 Itens) \n" +
                "5 - Excluir (Excluir Id)\n" +
                "X - Voltar\n");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.NEWTEXT;
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
