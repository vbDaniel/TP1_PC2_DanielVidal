package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Lozenge;

public class LozengeConsole extends BasicConsole{

    public Lozenge askLozenge(){
        showMsg("Digite um inteiro para a DIAGONAL maior de seu Losango: ");
        int newbigDiagonal = in.nextInt();
        showMsg("Digite um inteiro para a DIAGONAL menor de seu Losango: ");
        int newsmallDiagonal = in.nextInt();

        Lozenge newLozenge = new Lozenge(newbigDiagonal,newsmallDiagonal);
        showMsg("-------------------------------------------");
        showMsg("Seu Lozenge terá as seguintes dimensoes:\n" +
                "Diagonal maior: " + newbigDiagonal + "\n" +
                "Diagonal menor: " + newsmallDiagonal + "\n");


        return newLozenge;
    }
}
