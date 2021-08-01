package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.TriangleEquilateral;
import pc2.lab.aula09.model.TriangleIsosceles;
import pc2.lab.aula09.model.TriangleRight;

public class TriangleConsole extends BasicConsole{

    public TriangleRight askTriangleRight(){

        Point newPoint = new PointConsole().askPointOrigem();

        showLnMsg("Digite um inteiro para o tamanho da base do Triangulo Retangulo: ");
        int newBase  = in.nextInt();
        showLnMsg("Digite um inteiro para o tamanho da altura do Triangulo Retangulo: ");
        int newHight = in.nextInt();

        TriangleRight newTriangleRight = new TriangleRight(newPoint, newBase, newHight);

        showMsg("Seu Triagulo terá as seguintes dimensoes:\n" +
                "Base: " + newBase + "\n" +
                "Altura: " + newHight + "\n" +
                "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY()+ "\n" +
                "\n");

        return newTriangleRight;
    }

    public TriangleIsosceles askTriangleIsoceles(){

        Point newPoint = new PointConsole().askPointOrigem();

        showLnMsg("Digite um inteiro para o tamanho da base do Triangulo Isoceles: ");
        int newBase  = in.nextInt();
        showLnMsg("Digite um inteiro para o tamanho da altura do Triangulo Isoceles: ");
        int newHight = in.nextInt();

        TriangleIsosceles newTriangleIsosceles = new TriangleIsosceles(newPoint, newBase, newHight);

        showLnMsg("Seu Triangulo terá as seguintes dimensoes:\n" +
                "Base: " + newBase + "\n" +
                "Altura: " + newHight + "\n" +
                "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY()+ "\n" +
                "\n");
        return newTriangleIsosceles;
    }

    public TriangleEquilateral askTriangleEquilateral(){


        Point newPoint = new PointConsole().askPointOrigem();

        showLnMsg("Digite um inteiro para o tamanho dos lados do seu Triangulo Equilatero: ");
        int newSide  = in.nextInt();

        TriangleEquilateral newTriangleEquilateral= new TriangleEquilateral( newPoint, newSide);

        showMsg("Seu Triangulo terá as seguintes dimensoes:\n" +
                "Lados iguais: " + newSide + "\n" +
                "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY()+ "\n" +
                "\n");
        return newTriangleEquilateral;
    }

}
