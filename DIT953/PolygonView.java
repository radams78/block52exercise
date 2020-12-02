package DIT953;

import DIT953.model.PolygonModel;

import javax.swing.*;

public class PolygonView {
    private JFrame frame;

    public PolygonView(PolygonModel model) {
        frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(model);
        frame.setVisible(true);
    }
}
