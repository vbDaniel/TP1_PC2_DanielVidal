package pc2.lab.aula09.view;

import pc2.lab.aula09.model.TriangleIsosceles;
import pc2.lab.aula09.model.TriangleRight;

public class TriangleConsole extends BasicConsole{

    public TriangleRight askTriangleRight(){
        showMsg("Digite um inteiro para o tamanho da base do Triangulo Retangulo:");
        int newBase  = in.nextInt();
        showMsg("Digite um inteiro para o tamanho da altura do Triangulo Retangulo:");
        int newHight = in.nextInt();

        TriangleRight triangleRight = new TriangleRight(newBase, newHight);

        return triangleRight;
    }

    public TriangleIsosceles askTriangleIsoceles(){
        showMsg("Digite um inteiro para o tamanho da base do Triangulo Isoceles:");
        int newBase  = in.nextInt();
        showMsg("Digite um inteiro para o tamanho da altura do Triangulo Isoceles:");
        int newHight = in.nextInt();

        TriangleIsosceles triangleIsosceles = new TriangleIsosceles(newBase, newHight);

        return triangleIsosceles;
    }

}
