///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfStacks implements Iterable<StackOfConts> {
	private ArrayList<StackOfConts> contList;
	private final int START_X = 90;
	private int markedStackIndex;
	private boolean isMarked;

	public ListOfStacks() {
		contList = new ArrayList<StackOfConts>();
		int currentX = START_X;
		isMarked = false;
		for (int i = 0; i < 4; i++) {
			contList.add(new StackOfConts(currentX));
			currentX += 120;
		}
	}

	public void moveCont(StackOnTruck sot, TmpStack ts) {
		int index = getMarkedStackIndex();
		contList.get(index).moveCont(sot, ts);
	}

	public boolean isMarked() {
		for (int i = 0; i < contList.size(); i++) {
			if (contList.get(i).isMarked() == true)
				return true;
		}
		return false;
	}

	public void setMarked(int clickX, int clickY) {
		//#8- Facade, new from here
		SetMarked mark = new SetMarkedService();
		int markIndex= mark.set(clickX, clickY);
		if(markIndex!=-1)
			contList.get(markIndex).setIsMarked(clickY);
		
		/*old
		if ((clickX >= 90) && (clickX <= 200)) {
			contList.get(0).setIsMarked(clickY);
		} else if ((clickX >= 210) && (clickX <= 320)) {
			contList.get(1).setIsMarked(clickY);
		} else if ((clickX >= 330) && (clickX <= 440)) {
			contList.get(2).setIsMarked(clickY);
		} else if ((clickX >= 450) && (clickX <= 560)) {
			contList.get(3).setIsMarked(clickY);
		}
		*/
	}
	//till here

	//#4- iterator, new from here
	public int getMarkedStackIndex() {
		Iterator<StackOfConts> iterator = contList.iterator();
		int index = 0;

		while (iterator.hasNext()) {
			if (iterator.next().isMarked())
				markedStackIndex = index;
			index++;
		}
		return markedStackIndex;
	}

	public ArrayList<StackOfConts> getList() {
		return contList;
	}

	@Override
	public Iterator<StackOfConts> iterator() {
		return new Iterator<StackOfConts>() {
			private int i = 0;

			@Override
			public boolean hasNext() {
				return i < contList.size();
			}

			@Override
			public StackOfConts next() {
				return contList.get(i++);
			}
		};
	}

	public class ContListIterator implements Iterator<StackOfConts> {

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public StackOfConts next() {
			return null;
		}
	}
}
//till here