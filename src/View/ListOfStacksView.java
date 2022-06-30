///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import java.util.ArrayList;
import Model.StackOfConts;
import javafx.scene.Group;

public class ListOfStacksView {
	private ArrayList<StackOfConts> contList;

	public ListOfStacksView(ArrayList<StackOfConts> list) {
		contList = list;
	}

	public void show(Group root) {
		for (int i = 0; i < contList.size(); i++) {
			StackOfContsView sv = new StackOfContsView(contList.get(i));
			sv.show(root);
		}
	}
}
