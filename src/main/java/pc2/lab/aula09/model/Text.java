package pc2.lab.aula09.model;

import java.text.DecimalFormat;

public class Text extends Render{

    private Point origem;
    private String text;

    public Text(Point origem, String text){
        this.origem = origem;
        this.text = text;
    }

    @Override
    public int hashCode() {
        return 8;
    }

    @Override
    public String toString() {
        return "Text{\n" +
                "=> " + text + "\n" +
                "Posição => " + origem.toString() + "\n" +
                "}\n" +
                "---------------------------------------\n";
    }
}

