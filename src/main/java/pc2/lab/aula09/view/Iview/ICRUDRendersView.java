package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.enums.EnumMenuOption;

public interface ICRUDRendersView <T> extends IBasicView{
    public T askRender();
    public EnumMenuOption askMenu();
}
