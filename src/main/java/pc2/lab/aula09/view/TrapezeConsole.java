package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Square;
import pc2.lab.aula09.model.Trapeze;
import pc2.lab.aula09.model.enums.EnumMenuOption;

public class TrapezeConsole extends BasicConsole{

    public Trapeze askTrapeze() {

        int verif = 1;
        Trapeze newTrapeze = null;
        while (verif == 1) {
            Point newPoint = new PointConsole().askPointOrigem();

            showMsg("Digite um inteiro para a ALTURA de seu trapézio: ");
            int hight = in.nextInt();
            showMsg("Lembre-se a BASE é dividida em 3 parte que definem o angulo de seu trapezio(e a soma forma a base em si):\n");
            showMsg("Digite um inteiro para a primeira parte da BASE que define o angulo da esquerda: ");
            int firstPartBase = in.nextInt();
            showMsg("Digite um inteiro para a segunda parte da BASE que define o tamanho da BASE menor: ");
            int secundPartBase = in.nextInt();
            showMsg("Digite um inteiro para a primeira parte da BASE que define o angulo da Direita: ");
            int thirdPartBase = in.nextInt();

            showMsg("----------------------------------------------------------------\n");
            showMsg("Seu Trapesio terá as seguintes dimensoes:\n" +
                    "Altura: " + hight + "\n" +
                    "Base Maior: " + (firstPartBase + secundPartBase + thirdPartBase) + "\n" +
                    "Base Menor: " + secundPartBase + "\n" +
                    "Ponto Origem => x: " + newPoint.getX() + "y: " + newPoint.getY()+ "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2");
                    verif = in.nextInt();

            newTrapeze = new Trapeze(newPoint, hight, firstPartBase,secundPartBase, thirdPartBase);

        }
        return newTrapeze;
    }

    public EnumMenuOption askMenuTrapeze(MenuConsole menuScreen){

        showMsg("MENU *Trapezio*: \n" +
                "Digite uma opção: \n" +
                "1 - Novo Trapezio\n" +
                "2 - Editar Trapezio(Selecionar Id e Editar)\n" +
                "3 - Listar Trapezio(Listar Itens do Tipo) \n" +
                "4 - Mostrar o Trapezio (Listar detalhes de 1 Itens) \n" +
                "5 - Excluir (Excluir Id)\n" +
                "X - Voltar\n");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.NEWTRAPEZE;
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
