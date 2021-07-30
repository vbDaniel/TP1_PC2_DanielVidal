package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Rectangle;

public class RectangleConsole extends BasicConsole{

    public Rectangle askRectangle(){
        showMsg("Digite um inteiro para o tamanho da base do Retangulo:");
        int newBase  = in.nextInt();
        showMsg("Digite um inteiro para o tamanho da altura do Retangulo:");
        int newHight = in.nextInt();
        Rectangle newRectangle = new Rectangle(newBase, newHight);

        return newRectangle;
    }
}
