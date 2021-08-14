package pc2.lab.aula09.controller;

import pc2.lab.aula09.Dao.RenderDao;
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

public class CefetPaintByVidal {



    private Render[] vectorRenders;
    private final IBasicView basicScreen;
    private final IDrawBoardView canvas;
    private final ISquareView squareScreen;
    private final IRectangleView rectangleScreen;
    private final ILozengeView lozengeScreen;
    private final ITrapezeView trapezeScreen;
    private final ITriangleView triangleScreen;
    private final ICircleView circleScreen;
    private final IMenuView menuScreen;
    private final IRightView rightScreen;
    private final ITextView textConsole;
    private final RenderDao dao;


    public CefetPaintByVidal() {
        vectorRenders = new Render[10];
        basicScreen = new BasicConsole();
        canvas = new DesenhoBoard();
        squareScreen = new SquareConsole();
        rectangleScreen = new RectangleConsole();
        lozengeScreen = new LozengeConsole();
        trapezeScreen = new TrapezeConsole();
        triangleScreen = new TriangleConsole();
        circleScreen = new CircleConsole();
        menuScreen = new MenuConsole();
        rightScreen = new RightConsole();
        textConsole = new TextConsole();
        dao = new RenderDao();
    }
    /**
     * O método que mostra o menu apartir do Enum;
     *
     * @author primario Alessio.Jr
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

                                opcao = squareScreen.askMenuSquare(menuScreen);
                                switch (opcao) {
                                    case NEWSQUARE:
                                        Square squareNew = squareScreen.askSquare();
                                        insertRender(squareNew);
                                        break;
                                    case EDIT:
                                        editOnlyRender(1);
                                        break;
                                    case LIST:
                                        listOnlyRender(1);
                                        break;
                                    case SHOW:
                                        showOnlyOneFigure(1);
                                        break;
                                    case DELETE:
                                        deleteRenderHash(1);
                                        break;
                                    default:
                                        break;

                                }

                                break;
                            //2----------------------------------------------------------------------
                            case RECTANGLE:

                                EnumMenuOption opcaoDois = rectangleScreen.askMenuRectangle(menuScreen);
                                switch (opcaoDois) {
                                    case NEWRECTANGLE:
                                        Rectangle newRectangle = rectangleScreen.askRectangle();
                                        insertRender(newRectangle);
                                        break;
                                    case EDIT:
                                        editOnlyRender(2);
                                        break;
                                    case LIST:
                                        listOnlyRender(2);
                                        break;
                                    case SHOW:
                                        showOnlyOneFigure(2);
                                        break;
                                    case DELETE:
                                        deleteRenderHash(2);
                                        break;
                                    default:
                                        break;

                                }

                                break;
                            //3----------------------------------------------------------------------
                            case LOZENGE:

                                opcao = lozengeScreen.askMenuLozenge(menuScreen);
                                switch (opcao) {
                                    case NEWLOZENGE:
                                        Lozenge newLozenge = lozengeScreen.askLozenge();
                                        insertRender(newLozenge);
                                        break;
                                    case EDIT:
                                        editOnlyRender(3);
                                        break;
                                    case LIST:
                                        listOnlyRender(3);
                                        break;
                                    case SHOW:
                                        showOnlyOneFigure(3);
                                        break;
                                    case DELETE:
                                        deleteRenderHash(3);
                                        break;
                                    default:

                                        break;

                                }

                                break;
                            //4----------------------------------------------------------------------
                            case TRAPEZE:

                                opcao = trapezeScreen.askMenuTrapeze(menuScreen);
                                switch (opcao) {
                                    case NEWTRAPEZE:
                                        Trapeze newTrapeze = trapezeScreen.askTrapeze();
                                        insertRender(newTrapeze);
                                        break;
                                    case EDIT:
                                        editOnlyRender(4);
                                        break;
                                    case LIST:
                                        listOnlyRender(4);
                                        break;
                                    case SHOW:
                                        showOnlyOneFigure(4);
                                        break;
                                    case DELETE:
                                        deleteRenderHash(4);
                                        break;
                                    default:
                                        break;

                                }
                                break;
                            //5----------------------------------------------------------------------

                            case CIRCLE:

                                opcao = circleScreen.askMenuCircle(menuScreen);
                                switch (opcao) {
                                    case NEWCIRCLE:
                                        Circle newCircle = circleScreen.askCircle();
                                        insertRender(newCircle);
                                        break;
                                    case EDIT:
                                        editOnlyRender(5);
                                        break;
                                    case LIST:
                                        listOnlyRender(5);
                                        break;
                                    case SHOW:
                                        showOnlyOneFigure(5);
                                        break;
                                    case DELETE:
                                        deleteRenderHash(5);
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            //6----------------------------------------------------------------------
                            case TRIANGLE:

                                opcao = triangleScreen.askMenuTriangulo();
                                switch (opcao) {
                                    case NEWTRIANGLE:
                                        opcao = triangleScreen.askTrianguloEnum();
                                        triangleScreen.askTriangle(this);
                                        break;

                                    case EDIT:
                                        editOnlyRender(6);
                                        break;

                                    case LIST:
                                        listOnlyRender(6);
                                        break;
                                    case SHOW:
                                        showOnlyOneFigure(6);
                                        break;
                                    case DELETE:
                                        deleteRenderHash(6);
                                        break;
                                    default:
                                        break;

                                }
                                break;

                            //7----------------------------------------------------------------------
                            case RIGHT:

                                opcao = rightScreen.askMenuRight(menuScreen);
                                switch (opcao) {
                                    case NEWRIGHT:
                                        Right newRight = rightScreen.askRight();
                                        insertRender(newRight);
                                        break;
                                    case EDIT:
                                        editOnlyRender(7);
                                        break;
                                    case LIST:
                                        listOnlyRender(7);
                                        break;
                                    case SHOW:
                                        showOnlyOneFigure(7);
                                        break;
                                    case DELETE:
                                        deleteRenderHash(7);
                                        break;
                                    default:
                                        break;

                                }
                                break;
                            //8----------------------------------------------------------------------
                            case TEXT:
                                opcao = textConsole.askMenuText(menuScreen);
                                switch (opcao) {
                                    case NEWTEXT:
                                        Text newText = textConsole.askText();
                                        insertRender(newText);
                                        break;
                                    case EDIT:
                                        editOnlyRender(8);
                                        break;
                                    case LIST:
                                        listOnlyRender(8);
                                        break;
                                    case SHOW:
                                        showOnlyOneFigure(8);
                                        break;
                                    case DELETE:
                                        deleteRenderHash(8);
                                        break;
                                    default:

                                        break;

                                }
                                break;
                            //X----------------------------------------------------------------------
                            case BACK:
                                break;
                        }
                    }while (opcao != EnumMenuOption.BACK);

                    break;

                case LIST:
                    listRenders();
                    break;
                case DELETE:
                    deleteRendersGeometrics();
                    break;
                case DRAW:
                    break;
                case SAVE:
                    dao.saveDoc(vectorRenders);
                    break;
                case RECOVER:
                    try{
                        vectorRenders = dao.recoverDoc();
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
                case END:
                    break;
                default:
            }


        } while (opcao != EnumMenuOption.END);
    }

    public void insertRender(Render render) {

        for (int i = 0; i < vectorRenders.length; i++) {


            if((vectorRenders[i] != null) && ( i == vectorRenders.length-1)){
                basicScreen.showLineMessage("O vetor de figuras está cheio, Delete uma figura para seguir.");
                deleteRendersGeometrics();
            }
            if(vectorRenders[i] == null){
                vectorRenders[i] = render;

                break;
            }
        }
    }
    public void deleteRendersGeometrics() {
        listRenders();
        int id = basicScreen.askInt("\nEscolha apartir da ID da qual deseja apagar:");
        vectorRenders[id-1] = null;
        listRenders();
    }

    public void deleteRenderHash (int hash) {
        listOnlyRender(hash);
        int id = basicScreen.askInt("\nEscolha apartir da ID qual deseja apagar: ");
        vectorRenders[id-1] = null;
        listOnlyRender(hash);
    }

    public void editOnlyRender(int hash) {
        listOnlyRender(hash);

        int id = basicScreen.askInt("\nEscolha apartir da ID da qual voce deseja EDITAR:");
        switch (hash){
            case 1:
                vectorRenders[id-1] = squareScreen.askSquare();
                break;
            case 2:
                vectorRenders[id-1] = rectangleScreen.askRectangle();
                break;
            case 3:
                vectorRenders[id-1] = lozengeScreen.askLozenge();
                break;
            case 4:
                vectorRenders[id-1] = trapezeScreen.askTrapeze();
                break;
            case 5:
                vectorRenders[id-1] = circleScreen.askCircle();
                break;
            case 6:
                vectorRenders[id-1] = triangleScreen.askTriangle(this);
                break;
            case 7:
                vectorRenders[id-1] = rightScreen.askRight();
                break;
            case 8:
                vectorRenders[id-1] = textConsole.askText();
                break;

        }
        listOnlyRender(hash);
    }

      public void listRenders(){
        for (int i = 0; i < 10; i++) {
            if (vectorRenders[i] != null) {
                basicScreen.showMassage("ID: " + (i+1) + "\n");
                String figList = (vectorRenders[i].toString());
                basicScreen.showLineMessage(figList);
            }
        }
        basicScreen.showMassage("------------------------------------\n");
    }
    public void listOnlyRender(int hash){
        for (int i = 0; i < 10; i++) {
            if ((vectorRenders[i] != null) && (vectorRenders[i].hashCode() == hash)) {

                basicScreen.showMassage("ID: " + (i+1) + "\n");
                String figList = (vectorRenders[i].toString());
                basicScreen.showLineMessage(figList);
            }
        }

        basicScreen.showMassage("------------------------------------\n");
    }
    public void showOnlyOneFigure(int hash){
        listOnlyRender(hash);
        int id = basicScreen.askInt("\nEscolha apartir da ID quer mostrar: ");
        basicScreen.showMassage(vectorRenders[id-1].toString());
        basicScreen.showMassage("------------------------------------\n");
    }



}

