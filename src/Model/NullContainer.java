///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
//new class
package Model;

public class NullContainer extends AbstractContainer {
	private String msg = "NOT AVAILABLE";

	public NullContainer() {
		super(-1, -1);
	}

	public String toString() {
		return msg;
	}

	public String isMarked() {
		return msg;
	}

	public String getWidth() {
		return msg;
	}

	public String getHeight() {
		return msg;
	}

	public String getIsOnTruck() {
		return msg;
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
