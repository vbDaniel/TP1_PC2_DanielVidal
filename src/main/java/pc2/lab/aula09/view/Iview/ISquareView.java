package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.Square;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.cli.MenuConsole;

public interface ISquareView {
    public Square askSquare();
    public EnumMenuOption askMenuSquare();
}
