package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.ICRUDController;
import pc2.lab.aula09.model.Circle;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ICRUDRendersView;
import pc2.lab.aula09.view.cli.CircleConsole;

public class CircleController implements ICRUDController {

    private EnumMenuOption opcao;
    private RenderDao dao;
    private ICRUDRendersView circleScreen;

    public  CircleController(RenderDao dao){
        this.dao = dao;
        circleScreen = new CircleConsole();
    }
    @Override
    public EnumMenuOption start() {

        opcao = circleScreen.askMenu();
        switch (opcao) {
            case CREATE:
                create();
                break;
            case EDIT:
                dao.editOnlyRender(5);
                break;
            case LIST:
                dao.listOnlyRender(5);
                break;
            case SHOW:
                dao.showOnlyOneFigure(5);
                break;
            case DELETE:
                dao.deleteRenderHash(5);
                break;
            default:
                break;
        }
        return EnumMenuOption.BACK;
    }

    @Override
    public void create() {
        Circle newCircle = (Circle) circleScreen.askRender();
        dao.insertRender(newCircle);
    }
}
