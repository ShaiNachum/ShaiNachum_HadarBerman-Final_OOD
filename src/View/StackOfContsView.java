///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import Model.StackOfConts;
import javafx.scene.Group;

public class StackOfContsView {
	private StackOfConts stk;

	public StackOfContsView(StackOfConts st) {
		this.stk = st;
	}

	public void show(Group root) {
		for (int i = 0; i < stk.getSize(); i++) {
			ContainerView cv = new ContainerView(stk.getElement(i));
			cv.show(root);
		}
	}
}
