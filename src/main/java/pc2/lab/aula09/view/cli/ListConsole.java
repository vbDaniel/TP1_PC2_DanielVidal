package pc2.lab.aula09.view.cli;

public class ListConsole extends BasicConsole{

    public void showSpace(){
        showLnMsg("O vetor de figuras está cheio, Delete uma figura para SUBSTITUIR.");
    }

    public void showList(String figList){
        System.out.println(figList);
    }
}