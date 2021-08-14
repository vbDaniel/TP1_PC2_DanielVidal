package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.Lozenge;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.cli.MenuConsole;

public interface ILozengeView {
    public Lozenge askLozenge();
    public EnumMenuOption askMenuLozenge(IMenuView menuConsole);
}
