package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.IControllers.IRightController;
import pc2.lab.aula09.model.Right;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.IRightView;
import pc2.lab.aula09.view.cli.RightConsole;

public class RightController implements IRightController {

    private EnumMenuOption opcao;
    private RenderDao dao;
    private IRightView rightScreen;

    public RightController(RenderDao dao){
        this.dao = dao;
        rightScreen = new RightConsole();
    }
    @Override
    public EnumMenuOption start() {

        opcao = rightScreen.askMenuRight();
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
        Right newRight = rightScreen.askRight();
        dao.insertRender(newRight);
    }
}
