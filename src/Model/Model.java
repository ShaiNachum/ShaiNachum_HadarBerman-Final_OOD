///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669/////////////////////////////////////////////////////////////////////////
package Model;

import java.util.ArrayList;

public class Model {
	private ListOfStacks los;
	private StackOnTruck sot;
	private TmpStack ts;
	private Truck truck;
	private Ship defaultShip;
	private Ship ship;

	public Model() throws CloneNotSupportedException {
		los = new ListOfStacks();
		sot = StackOnTruck.getInstance();// new #2- singleton
		ts = new TmpStack();

		// #1- Builder, adding functionality to the truck for exampling builder
		truck = new Truck.Builder().addId(123456789).addBrand("Volvo").addModel("FH16").addDriverName("Shooki").build();
		System.out.println(truck);
		
		// #10- visitor, the truck is the same truck allays, the only thing that changes the owner/driver
		// so each time the truck will go throw the truck visitor to know the current truck driver/ visitor.
		TruckDriverVisitor truckDriverVisitor = new TruckDriverVisitor();
		System.out.println(truck.accept(truckDriverVisitor));

		// #3- prototype, adding functionality to the ship for exampling prototype
		defaultShip = new Ship(0000, "ZIM", "CARGO", "MR.Crab");
		ship = new Ship();

		ship = defaultShip.clone();
		ship.setId(123456);
		ship.setCaptainName("Popeye");
		System.out.println(ship);
		
	}

	public ArrayList<StackOfConts> getList() {
		return los.getList();
	}

	public void markCont(int cX, int cY) {
		if (los.isMarked() == false)
			los.setMarked(cX, cY);
	}

	public void moveCont() {
		los.moveCont(sot, ts);
	}

	public StackOnTruck getSot() {
		return sot;
	}

	public TmpStack getTs() {
		return ts;
	}

	public Truck getTruck() {
		return truck;
	}

	public Ship getShip() {
		return ship;
	}
}
