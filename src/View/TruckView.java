///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import Model.Truck;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TruckView {
	private Truck tV;
	
	public TruckView(Truck truck) {
		this.tV = truck;
	}
	
	public void show(Group root) {
		Rectangle r1 = new Rectangle(200, 480, 40, 55);
		r1.setFill(Color.YELLOW);
		Rectangle r2 = new Rectangle(205, 485, 25, 20);
		r2.setFill(Color.WHITESMOKE);
		r2.setStroke(Color.BLACK);
		Rectangle r3 = new Rectangle(240, 520, 150, 10);
		r3.setFill(Color.YELLOW);
		Circle c1 = new Circle(230, 535, 12);
		Circle c2 = new Circle(330, 535, 12);
		Circle c3 = new Circle(360, 535, 12);

		root.getChildren().addAll(r1, r2, r3, c1, c2, c3);
	}
}
