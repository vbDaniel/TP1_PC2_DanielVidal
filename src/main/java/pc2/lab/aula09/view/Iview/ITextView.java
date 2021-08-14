package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.Text;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.cli.MenuConsole;

public interface ITextView {
    public Text askText();
    public EnumMenuOption askMenuText(IMenuView menuConsole);
}
