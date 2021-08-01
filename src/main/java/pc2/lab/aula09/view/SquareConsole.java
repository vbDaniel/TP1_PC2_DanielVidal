package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Square;

public class SquareConsole extends BasicConsole{

    public Square askSquare(){
        Point newPoint = new PointConsole().askPointOrigem();

        showMsg("Digite um inteiro para o tamanho do lado do quadrado: ");
        int newSide  = in.nextInt();


        Square newQuad = new Square(newPoint, newSide);

        showMsg("Seu Quadrado terá as seguintes dimensoes:\n" +
                "Tamanho: " + newSide + "\n"+
                "Ponto Origem: \nx: " + newPoint.getX() + "\ny: " + newPoint.getY() + "\n" +
                "\n");

        return newQuad;
    }
}
