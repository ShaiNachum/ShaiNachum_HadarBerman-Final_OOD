///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
//new class
package Model;

public class Ship implements Cloneable {
	private int id;
	private String brand;
	private String type;
	private String captainName;

	public Ship() {
	}

	public Ship(int id, String brand, String type, String captainName) {
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.captainName = captainName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}


	@Override
	public String toString() {
		return "Ship [id=" + id + ", brand=" + brand + ", type=" + type + ", captainName=" + captainName + "]";
	}

	@Override
	public Ship clone() throws CloneNotSupportedException {
		return (Ship) super.clone();
	}

}
