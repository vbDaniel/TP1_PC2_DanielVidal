package pc2.lab.aula09.model;

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
}
