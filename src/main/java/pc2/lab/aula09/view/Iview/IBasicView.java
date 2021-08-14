package pc2.lab.aula09.view.Iview;

import java.util.Scanner;

public interface IBasicView {


    public void showLineMessage(String msg);
    public void showMassage(String msg);
    public int askInt(String msg);
    public int askInt();
    public double askDouble(String msg);
    public double askDouble();
    public boolean hasNextInt();
}
