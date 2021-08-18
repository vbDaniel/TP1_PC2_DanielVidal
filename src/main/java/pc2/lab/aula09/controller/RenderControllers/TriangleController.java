package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.IControllers.ITriangleController;
import pc2.lab.aula09.model.Trapeze;
import pc2.lab.aula09.model.Triangle;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ITriangleView;
import pc2.lab.aula09.view.cli.TriangleConsole;

public class TriangleController implements ITriangleController {

    private ITriangleView triangleScreen;
    private EnumMenuOption opcao;
    private RenderDao dao;

    public TriangleController(RenderDao dao){
        this.dao = dao;
        triangleScreen = new TriangleConsole();
    }


    @Override
    public EnumMenuOption start() {
        opcao = triangleScreen.askMenuTriangulo();
        switch (opcao) {
            case CREATE:
                create();
                break;
            case EDIT:
                dao.editOnlyRender(6);
                break;
            case LIST:
                dao.listOnlyRender(6);
                break;
            case SHOW:
                dao.showOnlyOneFigure(6);
                break;
            case DELETE:
                dao.deleteRenderHash(6);
                break;
            default:
                break;

        }
        return EnumMenuOption.BACK;
    }

    @Override
    public void create() {
        Triangle newTriangle = triangleScreen.askTriangle(dao);
        dao.insertRender(newTriangle);
    }
}
