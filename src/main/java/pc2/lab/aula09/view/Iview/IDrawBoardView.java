package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.model.FiguraGeometrica;

public interface IDrawBoardView extends IBasicView{

    public void desenhar(FiguraGeometrica[] figs);
}
