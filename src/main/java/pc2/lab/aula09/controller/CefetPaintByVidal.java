package pc2.lab.aula09.controller;

import pc2.lab.aula09.model.*;
import pc2.lab.aula09.model.enums.EnumMenuOption;
import pc2.lab.aula09.view.*;

public class CefetPaintByVidal {

    private FiguraGeometrica[] vectorFigure;
    private BasicConsole tela;
    private DesenhoBoard canvas;
    private SquareConsole squareScreen;
    private RectangleConsole rectangleScreen;
    private LozengeConsole lozengeScreen;
    private TrapezeConsole trapezeScreen;
    private TriangleConsole triangleScreen;
    private CircleConsole circleScreen;


    public CefetPaintByVidal() {
        vectorFigure = new FiguraGeometrica[5];
        tela = new BasicConsole();
        canvas = new DesenhoBoard();
        squareScreen = new SquareConsole();
        rectangleScreen = new RectangleConsole();
        lozengeScreen = new LozengeConsole();
        trapezeScreen = new TrapezeConsole();
        triangleScreen = new TriangleConsole();
        circleScreen = new CircleConsole();
    }

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

        EnumMenuOption opcao = EnumMenuOption.LIST;

        do {
            opcao = tela.askMainMenuOption();

            tela.showMsg("Você escolheu: " + opcao + "\n Siga os passos a seguir para criar: \n\n");

            switch (opcao) {

                case SQUARE:
                    Square squareNew = squareScreen.askSquare();
                    insertFiguraGeométrica(squareNew, 0);
                    break;
                case RECTANGLE:
                    Rectangle newRectangle = rectangleScreen.askRectangle();
                    insertFiguraGeométrica(newRectangle, 1);
                    break;
                case LOZENGE:
                    Lozenge newLozenge = lozengeScreen.askLozenge();
                    insertFiguraGeométrica(newLozenge, 1);
                    break;
                case TRAPEZE:
                    Trapeze newTrapeze = trapezeScreen.askTrapeze();
                    insertFiguraGeométrica(newTrapeze, 1);
                    break;

                case TRIANGLERIGHT:
                    Triangle newTriangleRight = triangleScreen.askTriangleRight();
                    insertFiguraGeométrica(newTriangleRight, 1);
                    break;
                case TRIANGLEISOSCELES:
                    Triangle newTriangleIso = triangleScreen.askTriangleIsoceles();
                    insertFiguraGeométrica(newTriangleIso, 1);
                    break;
                case TRIANGLEEQUILATERAL:
                    Triangle newTriangleEqui = triangleScreen.askTriangleEquilateral();
                    insertFiguraGeométrica(newTriangleEqui, 1);
                    break;
                case CIRCLE:
                    Circle newCircle = circleScreen.askCircle();
                    insertFiguraGeométrica(newCircle, 1);
                    break;

                case LIST:
                    //Retangulo retangulo = new Retangulo();
                    //inse/rtFiguraGeométrica(retangulo, 1);
                    for (int i = 0; i < vectorFigure.length; i++) {
                        if (vectorFigure[i] != null) {
                            System.out.println(vectorFigure[i].toString());
                        }
                    }
                    break;
                case DELETE:

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

    public boolean insertFiguraGeométrica(FiguraGeometrica fig, int i) {
        vectorFigure[i] = fig;

        for (i = 0; i < vectorFigure.length; ) {
            //Aqui tem um for
            // procura posição vazia
            // Se está cheio retorna False
            return true;
        }
        return false;
    }
}

