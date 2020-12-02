package DIT953.model;

import DIT953.model.polygons.polygon.IPolygon;
import DIT953.model.polygons.polygon.PolygonFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PolygonModel extends JComponent {
    private ArrayList<IPolygon> polygons;
    private boolean direction = true;
    private int ticker = 0;

    public PolygonModel() {
        polygons = new ArrayList<>(10);

        polygons.add(PolygonFactory.createSquare(50,50));
        polygons.add(PolygonFactory.createTriangle(100,100));
        polygons.add(PolygonFactory.createRectangle(50,150));
    }
    
    public void update() {
        ticker++;
        int value = direction ? 10 : -10;
        for (IPolygon p: polygons){
            p.updateCenter(p.getCenter().x+value, p.getCenter().y+value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
        repaint();
    }

    public void start() {
        try {
            while (true) {
                Thread.sleep(500);
                update();
            }
        } catch (InterruptedException e) {}
    }
    
    public void paint(Graphics g) {
        for (IPolygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint

}
