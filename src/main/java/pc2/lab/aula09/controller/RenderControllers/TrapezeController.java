package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.ICRUDController;
import pc2.lab.aula09.model.Trapeze;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ICRUDRendersView;
import pc2.lab.aula09.view.cli.TrapezeConsole;

public class TrapezeController implements ICRUDController {

    private RenderDao dao;
    private EnumMenuOption opcao;
    private ICRUDRendersView<Trapeze> trapezeScreen;


    public TrapezeController(RenderDao dao){
        this.dao = dao;
        trapezeScreen = new TrapezeConsole();
    }

    @Override
    public EnumMenuOption start() {

        opcao = trapezeScreen.askMenu();
        switch (opcao) {
            case CREATE:
                create();
                break;
            case EDIT:
                dao.editOnlyRender(4);
                break;
            case LIST:
                dao.listOnlyRender(4);
                break;
            case SHOW:
                dao.showOnlyOneFigure(4);
                break;
            case DELETE:
                dao.deleteRenderHash(4);
                break;
            default:
                break;

        }
        return EnumMenuOption.BACK;
    }

    @Override
    public void create() {
        Trapeze newTrapeze = trapezeScreen.askRender();
        dao.insertRender(newTrapeze);
    }
}
