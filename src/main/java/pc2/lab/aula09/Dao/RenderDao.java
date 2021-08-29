package pc2.lab.aula09.Dao;

import pc2.lab.aula09.model.Render;
import pc2.lab.aula09.view.Iview.*;
import pc2.lab.aula09.view.cli.*;
import java.io.*;

public class RenderDao {

    private Render[] vectorRenders;
    private final IBasicView basicScreen;
    private final IMenuView menuScreen;
    private final ICRUDRendersView squareScreen, rectangleScreen, lozengeScreen, trapezeScreen,
            circleScreen, rightScreen, textConsole, triangleScreen;


    public RenderDao(int tamanho){
        vectorRenders = new Render[tamanho];
        basicScreen = new BasicConsole();
        squareScreen = new SquareConsole();
        rectangleScreen = new RectangleConsole();
        lozengeScreen = new LozengeConsole();
        trapezeScreen = new TrapezeConsole();
        triangleScreen = new TriangleConsole();
        circleScreen = new CircleConsole();
        menuScreen = new MenuConsole();
        rightScreen = new RightConsole();
        textConsole = new TextConsole();
    }


    public Render[] getVectorRenders() {
        return vectorRenders;
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
                vectorRenders[id-1] = (Render) squareScreen.askRender();
                break;
            case 2:
                vectorRenders[id-1] = (Render) rectangleScreen.askRender();
                break;
            case 3:
                vectorRenders[id-1] = (Render) lozengeScreen.askRender();
                break;
            case 4:
                vectorRenders[id-1] = (Render) trapezeScreen.askRender();
                break;
            case 5:
                vectorRenders[id-1] = (Render) circleScreen.askRender();
                break;
            case 6:
                vectorRenders[id-1] = (Render) triangleScreen.askRender();
                break;
            case 7:
                vectorRenders[id-1] = (Render) rightScreen.askRender();
                break;
            case 8:
                vectorRenders[id-1] = (Render) textConsole.askRender();
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





    public void saveDoc(){
        try{
            FileOutputStream fileDoc = new FileOutputStream("RenderFile.dat");
            ObjectOutputStream object = new ObjectOutputStream(fileDoc);
            object.writeObject(vectorRenders); // AQUI CHAMA A EXCEPTION
            //object.close();
        }
        catch(FileNotFoundException notFound){
            System.out.println("Arquivo não existe tente novamente ;)");
        }
        catch(IOException io) {
            System.out.println("Há algo errado com I/O tente novamente ;)");
        }
        catch(Exception ex){
            System.out.println("Há algo errado tente novamente ;)");
        }

        System.out.println("Renderizaveis salvos com sucesso!!!");
    }


    public void recoverDoc() throws FileNotFoundException, IOException, ClassNotFoundException{

        FileInputStream doc = new FileInputStream("RenderFile.dat");
        ObjectInputStream object = new ObjectInputStream(doc);
        vectorRenders = (Render[]) object.readObject();

    }
}
