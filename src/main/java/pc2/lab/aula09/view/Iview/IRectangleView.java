package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.Rectangle;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.cli.MenuConsole;

public interface IRectangleView {
    public Rectangle askRectangle();
    public EnumMenuOption askMenuRectangle(IMenuView menuConsole);}