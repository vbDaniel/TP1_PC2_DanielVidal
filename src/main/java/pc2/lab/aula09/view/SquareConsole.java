package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Rectangle;
import pc2.lab.aula09.model.Square;

public class SquareConsole extends BasicConsole{

    public Square askSquare(){
        int verif = 1;
        Square newSquare = null;
        while (verif == 1) {
            Point newPoint = new PointConsole().askPointOrigem();

            showMsg("Digite um inteiro para o tamanho do lado do quadrado: ");
            int newSide  = in.nextInt();



            showMsg("----------------------------------------------------------------\n");
            showMsg("Seu Quadrado terá as seguintes dimensoes:\n" +
                    "Tamanho: " + newSide + "\n"+
                    "Ponto Origem: \nx: " + newPoint.getX() + "\ny: " + newPoint.getY() + "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2");
                    verif = in.nextInt();


            newSquare = new Square(newPoint, newSide);
        }


        return newSquare;
    }
}
