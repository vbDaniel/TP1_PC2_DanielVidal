package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Circle;
import pc2.lab.aula09.model.Point;
/**
 * A classe que cria os objetos Circulos a partir dos dados dos usuarios;
 *
 * @author Daniel Vidal
 * @version CefetPaint 1.0
 *
 */
public class CircleConsole extends BasicConsole{
    public Circle askCircle(){
        int verif = 1;
        Circle newCircle = null;
        while (verif == 1) {

            Point newcentralPoint =  new PointConsole().askPoint();
            showMsg("Digite um inteiro para o RAIO de seu circulo: ");
            int newRadius = in.nextInt();
            showMsg("Digite um inteiro para a quantidade de Pontos que formaram um circulo: ");
            int newManyPoints = in.nextInt();

            showMsg("----------------------------------------------------------------\n");
            showMsg("Seu Circulo terá as seguintes dimensoes:\n" +
                    "Coordenadas centrais: " + newcentralPoint + "\n" +
                    "Raio: " + newRadius + "\n" +
                    "Quantia de Pontos: " + newManyPoints + "\n" +
                    "\n" +
                    "Caso queira mudar digite 1 se não digite 2");
                    verif = in.nextInt();

            newCircle = new Circle(newcentralPoint,newRadius, newManyPoints);

        }

        return newCircle;
    }
}
