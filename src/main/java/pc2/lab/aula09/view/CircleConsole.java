package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Circle;
import pc2.lab.aula09.model.Point;

public class CircleConsole extends BasicConsole{
    public Circle askCircle(){
        Point newcentralPoint =  new PointConsole().askPoint();
        showMsg("Digite um inteiro para o RAIO de seu circulo: ");
        int newRadius = in.nextInt();
        showMsg("Digite um inteiro para a quantidade de Pontos que formaram um circulo: ");
        int newManyPoints = in.nextInt();
        showMsg("Digite um inteiro para a primeira parte da BASE que define o angulo da parte Direita: ");

        showMsg("Seu Circulo terá as seguintes dimensoes:\n" +
                "Coordenadas centrais: " + newcentralPoint + "\n" +
                "Raio: " + newRadius + "\n" +
                "Quantia de Pontos: " + newManyPoints + "\n" +
                "");

        Circle newCircle = new Circle(newcentralPoint,newRadius, newManyPoints);
        return newCircle;
    }
}
