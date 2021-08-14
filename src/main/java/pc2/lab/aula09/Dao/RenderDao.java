package pc2.lab.aula09.Dao;

import pc2.lab.aula09.model.Render;

import java.io.*;

public class RenderDao {

    public void saveDoc(Render[] render){
        try{
            FileOutputStream fileDoc = new FileOutputStream("Render.dat");
            ObjectOutputStream object = new ObjectOutputStream(fileDoc);
            object.writeObject(render);
        }
        catch(FileNotFoundException notFound){
            System.out.println("Arquivo não existe tente novamente ;)");
        }
        catch(IOException io){
            System.out.println("Há algo errado tente novamente ;)");
        }
        catch(Exception ex){
            System.out.println("Há algo errado tente novamente ;)");
        }

        System.out.println("Renderizaveis salvos com sucesso!!!");
    }


    public Render[] recoverDoc() throws FileNotFoundException, IOException, ClassNotFoundException{
        Render[] render;
        FileInputStream doc = new FileInputStream("Render.dat");
        ObjectInputStream object = new ObjectInputStream(doc);
        render = (Render[]) object.readObject();

        return render;
    }
}
