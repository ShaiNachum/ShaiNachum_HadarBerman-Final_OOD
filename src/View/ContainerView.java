///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import Model.Container;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ContainerView {
	private int x, y, height, width;
	private int r, g, b;
	private boolean isMarked;

	public ContainerView(Container container) {
		x = container.getX();
		y = container.getY();
		r = container.getR();
		g = container.getG();
		b = container.getB();
		height = container.getHeight();
		width = container.getWidth();
		isMarked = container.isMarked();
	}

	public void show(Group root) {
		Rectangle cont = new Rectangle(x, y, width, height);
		cont.setFill(Color.rgb(r, g, b));
		if (isMarked == true) {
			cont.setStroke(Color.RED);
			cont.setStrokeWidth(5.0);
		} else {
			cont.setStroke(Color.BLACK);
		}
		root.getChildren().add(cont);
	}
}
