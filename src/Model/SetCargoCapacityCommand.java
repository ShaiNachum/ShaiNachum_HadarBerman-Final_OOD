///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////
//new class
package Model;

public class SetCargoCapacityCommand implements Command{
	private ContainerCargo contCargo;
	
	public SetCargoCapacityCommand(ContainerCargo contCargo) {
		this.contCargo = contCargo;
	}
	
	@Override
	public void execute() {
		contCargo.setCapacity();
	}
}
