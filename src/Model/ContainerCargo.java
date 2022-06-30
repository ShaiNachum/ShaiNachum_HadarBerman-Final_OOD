///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////
//new class
package Model;

public class ContainerCargo {
	private boolean isFull = false;
	
	public void setCapacity() {
		isFull = !isFull;
		System.out.println(isFull);
	}
}
