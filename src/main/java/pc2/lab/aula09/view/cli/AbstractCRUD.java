package pc2.lab.aula09.view.cli;

import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ICRUDRendersView;

public abstract class AbstractCRUD <T> extends MenuConsole implements ICRUDRendersView <T> {
    public T askRender() {
        return null;
    }

    public EnumMenuOption askMenu() {
        return null;
    }
}
