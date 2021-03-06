package pc2.lab.aula09.view.gui;

import pc2.lab.aula09.model.Circle;
import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.cli.AbstractCRUD;

/**
 * A classe que cria os objetos Circulos a partir dos dados dos usuarios;
 *
 * @author Daniel Vidal
 * @version CefetPaint 1.0
 *
 */
public class CircleConsole extends AbstractCRUD<Circle> {

    @Override
    public Circle askRender(){
        int verif = 1;
        Circle newCircle = null;
        while (verif == 1) {

            Point newcentralPoint =  new PointConsole().askPoint();
            showMassage("Digite um inteiro para o RAIO de seu circulo: ");
            int newRadius = in.nextInt();
            showMassage("Digite um inteiro para a quantidade de Pontos que formaram um circulo: ");
            int newManyPoints = in.nextInt();

            showMassage("----------------------------------------------------------------\n");
            showMassage("Seu Circulo terá as seguintes dimensoes:\n" +
                    "Coordenadas centrais: " + newcentralPoint + "\n" +
                    "Raio: " + newRadius + "\n" +
                    "Quantia de Pontos: " + newManyPoints + "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2: ");
                    verif = in.nextInt();

            newCircle = new Circle(newcentralPoint,newRadius, newManyPoints);

        }

        return newCircle;
    }

    @Override
    public EnumMenuOption askMenu(){

        showMassage("MENU *Circulo*: \n" +
                        "Digite uma opção: \n" +
                        "1 - Novo Circulo\n" +
                        "2 - Editar Circulo(Selecionar Id e Editar)\n" +
                        "3 - Listar Circulos(Listar Itens do Tipo) \n" +
                        "4 - Mostrar o circulo(Listar detalhes de 1 Itens) \n" +
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
                return askMainMenuOption();
            default:
                return EnumMenuOption.END;
        }

    }

}
