package pc2.lab.aula09.view;

import pc2.lab.aula09.model.Point;

public class PointConsole extends BasicConsole{
    public Point askPoint(){
        showMsg("Digite as Coordenadas de X e Y do ponto CENTRAL desejado.\nX: ");
        int x = in.nextInt();
        showMsg("Y: ");
        int y = in.nextInt();
        Point newPoint = new Point(x, y);
        return newPoint;
    }
    public Point askPointOrigem(){
        showMsg("Digite as Coordenadas de X e Y do ponto ORIGEM de sua figura.\nX: ");
        int x = in.nextInt();
        showMsg("Y: ");
        int y = in.nextInt();
        Point newPoint = new Point(x, y);
        return newPoint;
    }
}
