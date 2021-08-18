package pc2.lab.aula09.view.Iview;

import pc2.lab.aula09.Dao.RenderDao;
import pc2.lab.aula09.controller.RenderControllers.TriangleController;
import pc2.lab.aula09.controller.VidalPaintController;
import pc2.lab.aula09.model.Triangle;
import pc2.lab.aula09.model.TriangleEquilateral;
import pc2.lab.aula09.model.TriangleIsosceles;
import pc2.lab.aula09.model.TriangleRight;
import pc2.lab.aula09.model.enums.EnumMenuOption;

public interface ITriangleView {
    public TriangleRight askTriangleRight();
    public TriangleIsosceles askTriangleIsoceles();
    public TriangleEquilateral askTriangleEquilateral();
    public EnumMenuOption askMenuTriangulo();
    public EnumMenuOption askTriangleEnum();
    public Triangle askTriangle(RenderDao dao);
}
