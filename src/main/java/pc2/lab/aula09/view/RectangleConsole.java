package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Lozenge;
import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Rectangle;

public class RectangleConsole extends BasicConsole{

    public Rectangle askRectangle(){

        int verif = 1;
        Rectangle newRectangle = null;
        while (verif == 1) {
            Point newPoint = new PointConsole().askPointOrigem();

            showMsg("Digite um inteiro para o tamanho da base do Retangulo:");
            int newBase  = in.nextInt();
            showMsg("Digite um inteiro para o tamanho da altura do Retangulo:");
            int newHight = in.nextInt();


            showMsg("----------------------------------------------------------------\n");
            showMsg("Seu Retangulo terá as seguintes dimensoes:\n" +
                    "Base: " + newBase+ "\n" +
                    "Altura: " + newHight + "\n" +
                    "Ponto Origem => x: " + newPoint.getX() + "\ny: " + newPoint.getY() + "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2");
                    verif = in.nextInt();


            newRectangle = new Rectangle(newPoint, newBase, newHight);
        }
        return newRectangle;
    }
}
