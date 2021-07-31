package pc2.lab.aula09.view;

import pc2.lab.aula09.model.TriangleEquilateral;
import pc2.lab.aula09.model.TriangleIsosceles;
import pc2.lab.aula09.model.TriangleRight;

public class TriangleConsole extends BasicConsole{

    public TriangleRight askTriangleRight(){
        showMsg("Digite um inteiro para o tamanho da base do Triangulo Retangulo: ");
        int newBase  = in.nextInt();
        showMsg("Digite um inteiro para o tamanho da altura do Triangulo Retangulo: ");
        int newHight = in.nextInt();

        TriangleRight newTriangleRight = new TriangleRight(newBase, newHight);

        showMsg("Seu Circulo terá as seguintes dimensoes:\n" +
                "Base: " + newBase + "\n" +
                "Altura: " + newHight + "\n");

        return newTriangleRight;
    }

    public TriangleIsosceles askTriangleIsoceles(){
        showMsg("Digite um inteiro para o tamanho da base do Triangulo Isoceles: ");
        int newBase  = in.nextInt();
        showMsg("Digite um inteiro para o tamanho da altura do Triangulo Isoceles: ");
        int newHight = in.nextInt();

        TriangleIsosceles newTriangleIsosceles = new TriangleIsosceles(newBase, newHight);

        showMsg("Seu Circulo terá as seguintes dimensoes:\n" +
                "Base: " + newBase + "\n" +
                "Altura: " + newHight + "\n");

        return newTriangleIsosceles;
    }

    public TriangleEquilateral askTriangleEquilateral(){

        showMsg("Digite um inteiro para o tamanho dos lados do seu Triangulo Equilatero: ");
        int newSide  = in.nextInt();

        TriangleEquilateral newTriangleEquilateral= new TriangleEquilateral(newSide);

        showMsg("Seu Circulo terá as seguintes dimensoes:\n" +
                "Lados iguais: " + newSide + "\n");

        return newTriangleEquilateral;
    }

}
