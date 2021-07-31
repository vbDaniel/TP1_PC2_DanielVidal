package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Square;

public class SquareConsole extends BasicConsole{

    public Square askSquare(){
        showMsg("Digite um interio para o tamanho do lado do quadrado");
        int newSide  = in.nextInt();
        Square newQuad = new Square(newSide);

        showMsg("Seu Quadrado terá as seguintes dimensoes:\n" +
                "Coordenadas centrais: " + newSide);

        return newQuad;
    }
}
