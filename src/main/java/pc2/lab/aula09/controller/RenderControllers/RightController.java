package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.ICRUDController;
import pc2.lab.aula09.model.Right;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ICRUDRendersView;
import pc2.lab.aula09.view.cli.RightConsole;

public class RightController implements ICRUDController {

    private EnumMenuOption opcao;
    private RenderDao dao;
    private ICRUDRendersView rightScreen;

    public RightController(RenderDao dao){
        this.dao = dao;
        rightScreen = new RightConsole();
    }
    @Override
    public EnumMenuOption start() {

        opcao = rightScreen.askMenu();
        switch (opcao) {
            case CREATE:
                create();
                break;
            case EDIT:
                dao.editOnlyRender(7);
                break;
            case LIST:
                dao.listOnlyRender(7);
                break;
            case SHOW:
                dao.showOnlyOneFigure(7);
                break;
            case DELETE:
                dao.deleteRenderHash(7);
                break;
            default:
                break;

        }
        return EnumMenuOption.BACK;
    }

    @Override
    public void create() {
        Right newRight = (Right) rightScreen.askRender();
        dao.insertRender(newRight);
    }
}
