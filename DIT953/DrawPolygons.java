package DIT953;

/* This is now all we (can) use from the sub-package */

/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the DIT953.model.shapes package.
 */
//import DIT953.model.adapter.*;

import DIT953.model.PolygonModel;

public class DrawPolygons {
    public static void main(String[] args) {
        PolygonModel model = new PolygonModel();
        PolygonView view = new PolygonView(model);
        model.start();
    }//main
}//DIT953.DrawPolygons