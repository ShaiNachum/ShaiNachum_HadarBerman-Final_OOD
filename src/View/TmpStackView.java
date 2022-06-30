///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import Model.TmpStack;
import javafx.scene.Group;

public class TmpStackView {
	private TmpStack tmp;

	public TmpStackView(TmpStack ts) {
		this.tmp = ts;
	}

	public void show(Group root) {
		for (int i = 0; i < tmp.getSize(); i++) {
			ContainerView cv = new ContainerView(tmp.getElement(i));
			cv.show(root);
		}
	}
}
