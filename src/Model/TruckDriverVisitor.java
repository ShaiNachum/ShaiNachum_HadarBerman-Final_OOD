///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
//new class
package Model;

public class TruckDriverVisitor implements TruckVisitor{

	@Override
	public String visit(Truck truck) {
		return truck.toString() + " Driver name: " + truck.getOwnerName();
	}

}
