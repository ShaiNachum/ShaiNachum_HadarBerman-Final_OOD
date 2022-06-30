///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
//new class
package Model;

public class Truck implements ITruckInfo{// the implementation was added for the visitor
	private int id;
	private String company;
	private String model;
	private String DriverName;

	public static class Builder {
		private Truck truck;

		public Builder() {
			truck = new Truck();
		}

		public Builder addId(int id) {
			truck.id = id;
			return this;
		}

		public Builder addBrand(String company) {
			truck.company = company;
			return this;
		}

		public Builder addModel(String model) {
			truck.model = model;
			return this;
		}

		public Builder addDriverName(String driverName) {
			truck.DriverName = driverName;
			return this;
		}

		public Truck build() {
			return truck;
		}
	}

	public int getId() {
		return id;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getOwnerName() {
		return DriverName;
	}

	@Override
	public String toString() {
		return "Truck [id: " + id + ", company: " + company + ", model: " + model +"]";
	}

	//new #10- Visitor
	@Override
	public String accept(TruckVisitor visitor) {
		return visitor.visit(this);
	}
	//till here
}
