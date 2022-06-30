///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
//new class
package Model;

public class MarkOn implements IContState{
	private Container cont;
	
	public MarkOn(Container cont) {
		this.cont = cont;
	}
	
	@Override
	public boolean getStatus() {
		return true;
	}

	@Override
	public void markOn() {
		System.out.println("Alredy on");
	}

	@Override
	public void markOff() {
		cont.setState(new MarkOff(cont));
	}

	
	
}
