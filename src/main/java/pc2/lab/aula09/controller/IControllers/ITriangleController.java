package pc2.lab.aula09.controller.IControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.model.Triangle;
import pc2.lab.aula09.model.enums.EnumMenuOption;

public interface ITriangleController {

    public EnumMenuOption start();
    public void create();
}
