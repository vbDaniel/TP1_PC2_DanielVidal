package pc2.lab.aula09.view;

import pc2.lab.aula09.model.*;
import pc2.lab.aula09.model.enums.EnumMenuOption;

public class TriangleConsole extends BasicConsole{

    public TriangleRight askTriangleRight(){
        int verif = 1;
        TriangleRight newTriangleRight = null;
        while (verif == 1) {
            Point newPoint = new PointConsole().askPointOrigem();

            showLnMsg("Digite um inteiro para o tamanho da base do Triangulo Retangulo: ");
            int newBase  = in.nextInt();
            showLnMsg("Digite um inteiro para o tamanho da altura do Triangulo Retangulo: ");
            int newHight = in.nextInt();



            showMsg("----------------------------------------------------------------\n");
            showMsg("Seu Triagulo terá as seguintes dimensoes:\n" +
                    "Base: " + newBase + "\n" +
                    "Altura: " + newHight + "\n" +
                    "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY()+ "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2");
                    verif = in.nextInt();

            newTriangleRight = new TriangleRight(newPoint, newBase, newHight);
        }

        return newTriangleRight;
    }

    public TriangleIsosceles askTriangleIsoceles(){

        int verif = 1;
        TriangleIsosceles  newTriangleIsosceles = null;
        while (verif == 1){

            Point newPoint = new PointConsole().askPointOrigem();

            showLnMsg("Digite um inteiro para o tamanho da base do Triangulo Isoceles: ");
            int newBase  = in.nextInt();
            showLnMsg("Digite um inteiro para o tamanho da altura do Triangulo Isoceles: ");
            int newHight = in.nextInt();



            showMsg("----------------------------------------------------------------\n");
            showLnMsg("Seu Triangulo terá as seguintes dimensoes:\n" +
                    "Base: " + newBase + "\n" +
                    "Altura: " + newHight + "\n" +
                    "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY()+ "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2");
                    verif = in.nextInt();

            newTriangleIsosceles = new TriangleIsosceles(newPoint, newBase, newHight);
        }
        return newTriangleIsosceles;
    }

    public TriangleEquilateral askTriangleEquilateral(){

        int verif = 1;
        TriangleEquilateral  newTriangleEquilateral = null;
        while (verif == 1){
            Point newPoint = new PointConsole().askPointOrigem();

            showLnMsg("Digite um inteiro para o tamanho dos lados do seu Triangulo Equilatero: ");
            int newSide  = in.nextInt();



            showMsg("----------------------------------------------------------------\n");
            showMsg("Seu Triangulo terá as seguintes dimensoes:\n" +
                    "Lados iguais: " + newSide + "\n" +
                    "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY()+ "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2");
                    verif = in.nextInt();

            newTriangleEquilateral= new TriangleEquilateral( newPoint, newSide);
        }
        return newTriangleEquilateral;
    }

    public EnumMenuOption askMenuTriangulo(){

        showMsg("MENU *Triangulo*: \n" +
                "Digite uma opção: \n" +
                "1 - Novo Triangulo\n" +
                "2 - Editar Triangulo(Selecionar Id e Editar)\n" +
                "3 - Listar Triangulo(Listar Itens do Tipo) \n" +
                "4 - Mostrar o Triangulo(Listar detalhes de 1 Itens) \n" +
                "5 - Excluir (Excluir Id)\n" +
                "X - Voltar\n");

        String option = in.next();

        switch (option){
            case "1":
                return EnumMenuOption.NEWTRIANGLE;
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
