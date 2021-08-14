package pc2.lab.aula09.view.gui;

import pc2.lab.aula09.view.cli.BasicConsole;

public class ListGui extends BasicConsole {

    public void showSpace(){
        showLineMessage("O vetor de figuras está cheio, Delete uma figura para SUBSTITUIR.");
    }

    public void showList(String figList){
        System.out.println(figList);
    }
}
