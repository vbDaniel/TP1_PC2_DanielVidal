package pc2.lab.aula09.controller;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.RenderControllers.*;
import pc2.lab.aula09.model.*;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.Iview.*;
import pc2.lab.aula09.view.cli.*;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A classe que é a base das interações do menu.
 *
 * @author Daniel Vidal
 * @version CefetPaint 1.0
 *
 */

public class VidalPaintController {



    private final IBasicView basicScreen;
    private final IDrawBoardView canvas;
    private final IMenuView menuScreen;
    private final RenderDao dao;
    private final SquareController squareControl;
    private final RectangleController rectangleController;
    private final LozengeController lozengeController;
    private final TrapezeController trapezeController;
    private final CircleController circleController;
    private final TriangleController triangleController;
    private final RightController rightController;
    private final TextController textController;

    public VidalPaintController() {
        basicScreen = new BasicConsole();
        menuScreen = new MenuConsole();
        canvas = new DesenhoBoard();
        dao = new RenderDao(10);
        squareControl = new SquareController(dao);
        rectangleController = new RectangleController(dao);
        lozengeController = new LozengeController(dao);
        trapezeController = new TrapezeController(dao);
        circleController = new CircleController(dao);
        triangleController = new TriangleController(dao);
        rightController = new RightController(dao);
        textController = new TextController(dao);


    }
    /**
     * O método que mostra o menu apartir do Enum;
     *
     * @author first Alessio.Jr secund Daniel Vidal
     *
     */
    public void showMenu() {

        EnumMenuOption opcao;
        do {
            opcao = menuScreen.askMainMenuOption();

            basicScreen.showMassage("---------------------------------------\n");
            basicScreen.showMassage("Você escolheu: " + opcao + "\n");
            basicScreen.showMassage("---------------------------------------\n");
            switch (opcao) {
                case MAKERENDER:

                    do {
                        opcao = menuScreen.askMenuMakeFig();
                        switch (opcao) {
                            //1----------------------------------------------------------------------
                            case SQUARE:
                                squareControl.start();
                                break;

                            //2----------------------------------------------------------------------
                            case RECTANGLE:
                                rectangleController.start();
                                break;

                            //3----------------------------------------------------------------------
                            case LOZENGE:
                                lozengeController.start();
                                break;

                            //4----------------------------------------------------------------------
                            case TRAPEZE:
                                trapezeController.start();
                                break;
                            //5----------------------------------------------------------------------

                            case CIRCLE:
                                circleController.start();
                                break;

                            //6----------------------------------------------------------------------
                            case TRIANGLE:
                                triangleController.start();
                                break;

                            //7----------------------------------------------------------------------
                            case RIGHT:
                                rightController.start();
                                break;

                            //8----------------------------------------------------------------------
                            case TEXT:
                                textController.start();
                                break;

                            //X----------------------------------------------------------------------
                            case BACK:
                                break;
                        }
                    }while (opcao != EnumMenuOption.BACK);

                    break;

                case DELETE:
                    dao.deleteRendersGeometrics();
                    break;
                case DRAW:
                    break;
                case SAVE:
                    dao.saveDoc();
                    break;
                case RECOVER:
                    try{
                        dao.recoverDoc();
                    }
                    catch(FileNotFoundException noFile){
                        basicScreen.showMassage("Arquivo não existe tente novamente ;)");
                    }
                    catch(IOException io){
                        basicScreen.showMassage("Há algo errado tente novamente ;)");
                    }
                    catch (ClassNotFoundException noClass){
                        basicScreen.showMassage("Há algo errado...");
                    }

                    break;

                case LIST:
                    dao.listRenders();
                    break;
                case END:
                    break;
                default:
            }


        } while (opcao != EnumMenuOption.END);
    }
}

