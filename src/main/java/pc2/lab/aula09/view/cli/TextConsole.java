package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.model.enums.EnumMenuOption;

public class TextConsole extends BasicConsole{




    public EnumMenuOption askMenuText(MenuConsole menuConsole){

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
