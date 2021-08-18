package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.IControllers.ILozangerController;
import pc2.lab.aula09.model.Lozenge;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ILozengeView;
import pc2.lab.aula09.view.Iview.IRectangleView;
import pc2.lab.aula09.view.cli.LozengeConsole;

public class LozengeController implements ILozangerController {

    private ILozengeView lozengeScreen;
    private EnumMenuOption opcao;
    private RenderDao dao;

    public LozengeController(RenderDao dao){
        this.dao = dao;
        lozengeScreen = new LozengeConsole();
    }

    @Override
    public EnumMenuOption start() {

        opcao = lozengeScreen.askMenuLozenge();
        switch (opcao) {
            case CREATE:
                create();
                break;
            case EDIT:
                dao.editOnlyRender(3);
                break;
            case LIST:
                dao.listOnlyRender(3);
                break;
            case SHOW:
                dao.showOnlyOneFigure(3);
                break;
            case DELETE:
                dao.deleteRenderHash(3);
                break;
            default:
                break;

        }
        return EnumMenuOption.BACK;
    }

    @Override
    public void create() {
        Lozenge newLozenge = lozengeScreen.askLozenge();
        dao.insertRender(newLozenge);
    }
}
