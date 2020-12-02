package DIT953.model.polygons.polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-02-19.
 */
public interface IPolygon {
    void paint(Graphics g);
    void updateCenter(int newX, int newY);
    Point getCenter();
}
