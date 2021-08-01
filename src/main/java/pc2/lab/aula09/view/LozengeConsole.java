package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Lozenge;
import pc2.lab.aula09.model.Point;

public class LozengeConsole extends BasicConsole{

    public Lozenge askLozenge(){

        Point newPoint = new PointConsole().askPointOrigem();

        showMsg("Digite um inteiro para a DIAGONAL maior de seu Losango: ");
        int newbigDiagonal = in.nextInt();
        showMsg("Digite um inteiro para a DIAGONAL menor de seu Losango: ");
        int newsmallDiagonal = in.nextInt();

        Lozenge newLozenge = new Lozenge(newPoint, newbigDiagonal,newsmallDiagonal);
        showMsg("----------------------------------------------------------------\n");
        showMsg("Seu Losango terá as seguintes dimensoes:\n" +
                "Diagonal maior: " + newbigDiagonal + "\n" +
                "Diagonal menor: " + newsmallDiagonal + "\n" +
                "Ponto Origem => \nx: " + newPoint.getX() + "\ny: " + newPoint.getY()+ "\n" +
                "\n");
        showMsg("----------------------------------------------------------------\n");
        return newLozenge;
    }
}
