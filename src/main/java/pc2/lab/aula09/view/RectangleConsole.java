package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Rectangle;

public class RectangleConsole extends BasicConsole{

    public Rectangle askRectangle(){

        Point newPoint = new PointConsole().askPointOrigem();

        showMsg("Digite um inteiro para o tamanho da base do Retangulo:");
        int newBase  = in.nextInt();
        showMsg("Digite um inteiro para o tamanho da altura do Retangulo:");
        int newHight = in.nextInt();
        Rectangle newRectangle = new Rectangle(newPoint, newBase, newHight);

        showMsg("Seu Retangulo terá as seguintes dimensoes:\n" +
                "Base: " + newBase+ "\n" +
                "Altura: " + newHight + "\n" +
                "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY() + "\n" +
                "\n");

        return newRectangle;
    }
}
