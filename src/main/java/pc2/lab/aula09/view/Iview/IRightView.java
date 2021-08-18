package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.Right;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.IMenuView;

public interface IRightView {
    public Right askRight();
    public EnumMenuOption askMenuRight();
}
