///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import Model.StackOnTruck;
import javafx.scene.Group;

public class StackOnTruckView {
	private StackOnTruck sot;

	public StackOnTruckView(StackOnTruck st) {
		this.sot = st;
	}

	public void show(Group root) {
		for (int i = 0; i < sot.getSize(); i++) {
			ContainerView cv = new ContainerView(sot.getElement(i));
			cv.show(root);
		}
	}
}
