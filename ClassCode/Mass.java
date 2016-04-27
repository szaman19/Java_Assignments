package physics;

public class Mass{
  private double mass;


	/**
	* Create string representation of Mass for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Mass [mass=" + mass + "]";
	}


	/**
	* Default empty Mass constructor
	*/
	public Mass() {
		super();
	}

	/**
	* Default Mass constructor
	*/
	public Mass(double mass) {
		super();
		this.mass = mass;
	}

	/**
	* Returns value of mass
	* @return
	*/
	public double getMass() {
		return mass;
	}

	/**
	* Sets new value of mass
	* @param
	*/
	public void setMass(double mass) {
		this.mass = mass;
	}
}
