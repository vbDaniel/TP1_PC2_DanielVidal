package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.ICRUDController;
import pc2.lab.aula09.model.Square;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ICRUDRendersView;
import pc2.lab.aula09.view.cli.SquareConsole;


public class SquareController  implements ICRUDController {

    private ICRUDRendersView <Square> squareScreen;
    private EnumMenuOption opcao;
    private RenderDao dao;

    public SquareController(RenderDao dao) {
        squareScreen = new SquareConsole();
        this.dao = dao;
    }
    @Override
    public EnumMenuOption start() {

        opcao = squareScreen.askMenu();
        switch (opcao) {
            case CREATE:
                create();
                break;
            case EDIT:
               dao.editOnlyRender(1);
                break;
            case LIST:
               dao.listOnlyRender(1);
                break;
            case SHOW:
                dao.showOnlyOneFigure(1);
                break;
            case DELETE:
               dao.deleteRenderHash(1);
                break;
            default:
                break;

        }
        return null;
    }

    @Override
    public void create() {
        Square squareNew =  squareScreen.askRender();
        dao.insertRender(squareNew);
    }
}
