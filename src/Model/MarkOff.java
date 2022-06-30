///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
//new class
package Model;

public class MarkOff implements IContState{
	private Container cont;
	
	public MarkOff(Container cont) {
		this.cont = cont;
	}
	
	@Override
	public boolean getStatus() {
		return false;
	}

	@Override
	public void markOn() {
		cont.setState(new MarkOn(cont));		
	}

	@Override
	public void markOff() {
		System.out.println("Already off");
	}

}
