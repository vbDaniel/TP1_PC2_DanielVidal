package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.Trapeze;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.cli.MenuConsole;

public interface ITrapezeView {
    public Trapeze askTrapeze();
    public EnumMenuOption askMenuTrapeze(IMenuView menuScreen);
}
