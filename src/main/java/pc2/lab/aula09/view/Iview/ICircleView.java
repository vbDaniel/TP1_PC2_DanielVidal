package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.Circle;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.cli.MenuConsole;

public interface ICircleView {
    public Circle askCircle();
    public EnumMenuOption askMenuCircle(IMenuView menuConsole);
}
