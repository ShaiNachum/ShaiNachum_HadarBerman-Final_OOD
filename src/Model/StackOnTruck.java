///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Model;

import java.util.Stack;

public class StackOnTruck {
	private static volatile StackOnTruck INSTANCE = null;// added this
	private Stack<Container> stkOnTruck;
	private int sX, sY;
	private boolean isEmpty;

	private StackOnTruck() {// was public
		isEmpty = true;
		stkOnTruck = new Stack<Container>();
		sX = 260;
		sY = 475;
	}

	//#2- Singleton, new from here 
	public static StackOnTruck getInstance() {
		StackOnTruck result = INSTANCE;
		if (result == null) {
			synchronized (StackOnTruck.class) {
				result = INSTANCE;
				if (result == null) {
					INSTANCE = result = new StackOnTruck();
				}
			}
		}
		return result;
	}
	//till here

	public void addToTruck(Container cont) {
		cont.setX(sX);
		cont.setY(sY);
		stkOnTruck.push(cont);
		isEmpty = false;
		cont.setMarked(false);
	}

	public int getSize() {
		return stkOnTruck.size();
	}

	public Container getElement(int index) {
		return stkOnTruck.get(index);
	}

	public boolean isEmpty() {
		return isEmpty;
	}

}
