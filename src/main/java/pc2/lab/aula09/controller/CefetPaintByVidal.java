package pc2.lab.aula09.controller;

import pc2.lab.aula09.model.*;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.*;

/**
 * A classe que é a base das interações do menu.
 *
 * @author Daniel Vidal
 * @version CefetPaint 1.0
 *
 */

public class CefetPaintByVidal {



    private FiguraGeometrica[] vectorFigure;
    private final BasicConsole tela;
    private final DesenhoBoard canvas;
    private final SquareConsole squareScreen;
    private final RectangleConsole rectangleScreen;
    private final LozengeConsole lozengeScreen;
    private final TrapezeConsole trapezeScreen;
    private final TriangleConsole triangleScreen;
    private final CircleConsole circleScreen;
    private final ListConsole listScreen;


    public CefetPaintByVidal() {
        vectorFigure = new FiguraGeometrica[10];
        tela = new BasicConsole();
        canvas = new DesenhoBoard();
        squareScreen = new SquareConsole();
        rectangleScreen = new RectangleConsole();
        lozengeScreen = new LozengeConsole();
        trapezeScreen = new TrapezeConsole();
        triangleScreen = new TriangleConsole();
        circleScreen = new CircleConsole();
        listScreen = new ListConsole();
    }
    /**
     * O método que mostra o menu apartir do Enum;
     *
     * @author primario Alessio.Jr
     *
     */
    public void showMenu() {
        /*
        //testaArrayList();
        Point pont1 = new Point(0, 0);
        Point pont2 = new Point(5, 6);
        Point pont3 = new Point(2, 8);
        Point pont4 = new Point(4, 4);


         Square squareNovo = new Square();
         Square square1 = new Square(1);
         Square square2 = new Square(pont1, 5);

         Rectangle rect1 = new Rectangle(1, 2);
         Rectangle rect3 = new Rectangle(4, 2);
         //Quadrado quadrado2 = new Quadrado(pont1, pont2, pont3,pont4);
        */

        EnumMenuOption opcao, opcao2;
        do {
            opcao = tela.askMainMenuOption();

            tela.showMsg("---------------------------------------\n");
            tela.showMsg("Você escolheu: " + opcao + "\n");
            tela.showMsg("---------------------------------------\n");
            switch (opcao) {
                case MAKEFIGURA:
                    opcao2 = tela.askMenuMakeFig();

                    switch (opcao2){
                        case SQUARE:
                            Square squareNew = squareScreen.askSquare();
                            insertFiguraGeometrica(squareNew);
                            break;
                        case RECTANGLE:
                            Rectangle newRectangle = rectangleScreen.askRectangle();
                            insertFiguraGeometrica(newRectangle);
                            break;
                        case LOZENGE:
                            Lozenge newLozenge = lozengeScreen.askLozenge();
                            insertFiguraGeometrica(newLozenge);
                            break;
                        case TRAPEZE:
                            Trapeze newTrapeze = trapezeScreen.askTrapeze();
                            insertFiguraGeometrica(newTrapeze);
                            break;

                        case TRIANGLERIGHT:
                            Triangle newTriangleRight = triangleScreen.askTriangleRight();
                            insertFiguraGeometrica(newTriangleRight);
                            break;
                        case TRIANGLEISOSCELES:
                            Triangle newTriangleIso = triangleScreen.askTriangleIsoceles();
                            insertFiguraGeometrica(newTriangleIso);
                            break;
                        case TRIANGLEEQUILATERAL:
                            Triangle newTriangleEqui = triangleScreen.askTriangleEquilateral();
                            insertFiguraGeometrica(newTriangleEqui);
                            break;
                        case CIRCLE:
                            Circle newCircle = circleScreen.askCircle();
                            insertFiguraGeometrica(newCircle);
                            break;
                    }
                    break;

                case LIST:
                    listFiguraGeometrica();
                    break;
                case DELETE:
                    listFiguraGeometrica();
                    deleteFiguraGeometrica();
                    listFiguraGeometrica();
                    break;
                case DRAW:
                    canvas.desenhar(vectorFigure);
                    break;
                case END:
                    break;
                default:
            }


        } while (opcao != EnumMenuOption.END);
    }

    public void insertFiguraGeometrica(FiguraGeometrica figura) {

        for (int i = 0; i < vectorFigure.length;  i++) {


            if((vectorFigure[i] != null) && ( i == vectorFigure.length-1)){
                listScreen.showSpace();

            }
            if(vectorFigure[i] == null){
                vectorFigure[i] = figura;

                break;
            }
        }
    }
    public void deleteFiguraGeometrica() {

        listScreen.showMsg("Escolha apartir da ID da figura qual voce deseja apagar:");
        int id = listScreen.askInt();
        vectorFigure[id-1] = null;

    }
    public void listFiguraGeometrica(){
        for (int i = 0; i < 10; i++) {
            if (vectorFigure[i] != null) {
                listScreen.showMsg("ID: " + (i+1) + "\n");
                String figList = (vectorFigure[i].toString());
                listScreen.showList(figList);
            }
        }
    }
}

