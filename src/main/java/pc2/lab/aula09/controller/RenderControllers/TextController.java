package pc2.lab.aula09.controller.RenderControllers;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.IControllers.ITextController;
import pc2.lab.aula09.model.Text;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.ITextView;
import pc2.lab.aula09.view.cli.RightConsole;
import pc2.lab.aula09.view.cli.TextConsole;

public class TextController implements ITextController {

    private EnumMenuOption opcao;
    private RenderDao dao;
    private ITextView textScreen;

    public TextController(RenderDao dao){
        this.dao = dao;
        textScreen = new TextConsole();
    }


    @Override
    public EnumMenuOption start() {
        opcao = textScreen.askMenuText();
        switch (opcao) {
            case CREATE:
                create();
                break;
            case EDIT:
                dao.editOnlyRender(8);
                break;
            case LIST:
                dao.listOnlyRender(8);
                break;
            case SHOW:
                dao.showOnlyOneFigure(8);
                break;
            case DELETE:
                dao.deleteRenderHash(8);
                break;
            default:

                break;

        }
        return EnumMenuOption.BACK;
    }

    @Override
    public void create() {
        Text newText = textScreen.askText();
        dao.insertRender(newText);
    }
}
