///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Model;

import java.util.Stack;

public class TmpStack {
	private Stack<Container> tmp_stk;
	private int sX, sY;
	private int currentY;

	public TmpStack() {
		tmp_stk = new Stack<Container>();
		sX = 670;
		sY = 540;
		currentY = sY;
	}

	public void addToTmp(Container cont) {
		cont.setX(sX);
		cont.setY(currentY);
		tmp_stk.push(cont);
		currentY -= 45;
	}

	public int getSize() {
		return tmp_stk.size();
	}

	public Container getElement(int index) {
		return tmp_stk.get(index);
	}

	public Container getLast() {
		return tmp_stk.pop();
	}

	public boolean isEmpty() {
		return tmp_stk.isEmpty();
	}
}
