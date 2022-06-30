///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import Model.Ship;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class ShipView {
	private Ship sV;

	public ShipView(Ship ship) {
		this.sV = ship;
	}

	public void show(Group root) {
		Polygon p = new Polygon();
		p.getPoints().addAll(new Double[] { 70.0, 540.0, 540.0, 540.0, 660.0, 440.0, 50.0, 440.0 });
		p.setStroke(Color.BLACK);
		//p.setFill(Color.FIREBRICK); old
		
		//new form here- #9- Decorator
		ShapeColor color= new RedColor();
		p.setFill(color.getColor());
		//till here
		
		root.getChildren().add(p);
	}

}
