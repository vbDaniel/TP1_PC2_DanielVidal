package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.ICRUDController;
import pc2.lab.aula09.model.Rectangle;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ICRUDRendersView;
import pc2.lab.aula09.view.cli.RectangleConsole;

public class RectangleController implements ICRUDController {

    private ICRUDRendersView rectangleScreen;
    private EnumMenuOption opcao;
    private RenderDao dao;

    public RectangleController(RenderDao dao) {
        this.dao = dao;
        rectangleScreen = new RectangleConsole();
    }

    @Override
    public EnumMenuOption start() {
        
        EnumMenuOption option = rectangleScreen.askMenu();
        switch (option) {
            case CREATE:
                create();
                break;
            case EDIT:
                dao.editOnlyRender(2);
                break;
            case LIST:
                dao.listOnlyRender(2);
                break;
            case SHOW:
                dao.showOnlyOneFigure(2);
                break;
            case DELETE:
                dao.deleteRenderHash(2);
                break;
            default:
                break;

        }
        return EnumMenuOption.BACK;
    }

    @Override
    public void create() {
        Rectangle newRectangle = (Rectangle) rectangleScreen.askRender();
        dao.insertRender(newRectangle);
    }
}
