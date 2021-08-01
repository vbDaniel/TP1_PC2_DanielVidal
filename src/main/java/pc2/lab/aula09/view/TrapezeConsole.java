package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Point;
import pc2.lab.aula09.model.Trapeze;

public class TrapezeConsole extends BasicConsole{

    public Trapeze askTrapeze() {


        Point newPoint = new PointConsole().askPointOrigem();

        showMsg("Digite um inteiro para a ALTURA de seu trapézio: ");
        int hight = in.nextInt();
        showMsg("Lembre-se a BASE é dividida em 3 parte que definem o angulo de seu trapezio(e a soma forma a base em si):\n");
        showMsg("Digite um inteiro para a primeira parte da BASE que define o angulo da esquerda: ");
        int firstPartBase = in.nextInt();
        showMsg("Digite um inteiro para a segunda parte da BASE que define o tamanho da BASE menor: ");
        int secundPartBase = in.nextInt();
        showMsg("Digite um inteiro para a primeira parte da BASE que define o angulo da Direita: ");
        int thirdPartBase = in.nextInt();

        showMsg("Seu Trapesio terá as seguintes dimensoes:\n" +
                "Altura: " + hight + "\n" +
                "Base Maior: " + (firstPartBase + secundPartBase + thirdPartBase) + "\n" +
                "Base Menor: " + secundPartBase + "\n" +
                "Ponto Origem => x: " + newPoint.getX() + "y: " + newPoint.getY()+ "\n" +
                "\n");

        Trapeze newTrapeze = new Trapeze(newPoint, hight, firstPartBase,secundPartBase, thirdPartBase);

        return newTrapeze;


    }
}
