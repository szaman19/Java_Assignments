package assignment04;

public class Coordinate implements Comparable<Coordinate>{
  private Meridional northSouth;
  private Zonal eastWest;
  private int mDegrees;
  private int mMinutes;
  private int mSeconds;
  private int zDegrees;
  private int zMinutes;
  private int zSeconds;






	/**
	* Default Coordinate constructor
	*/
	public Coordinate(Meridional northSouth, Zonal eastWest, int mDegrees, int mMinutes, int mSeconds, int zDegrees, int zMinutes, int zSeconds) {
		this.northSouth = northSouth;
		this.eastWest = eastWest;
		this.mDegrees = mDegrees;
		this.mMinutes = mMinutes;
		this.mSeconds = mSeconds;
		this.zDegrees = zDegrees;
		this.zMinutes = zMinutes;
		this.zSeconds = zSeconds;
	}


	/**
	* Returns value of northSouth
	* @return
	*/
	public Meridional getNorthSouth() {
		return northSouth;
	}

	/**
	* Sets new value of northSouth
	* @param
	*/
	public void setNorthSouth(Meridional northSouth) {
		this.northSouth = northSouth;
	}

	/**
	* Returns value of eastWest
	* @return
	*/
	public Zonal getEastWest() {
		return eastWest;
	}

	/**
	* Sets new value of eastWest
	* @param
	*/
	public void setEastWest(Zonal eastWest) {
		this.eastWest = eastWest;
	}

	/**
	* Returns value of mDegrees
	* @return
	*/
	public int getMDegrees() {
		return mDegrees;
	}

	/**
	* Sets new value of mDegrees
	* @param
	*/
	public void setMDegrees(int mDegrees) {
		this.mDegrees = mDegrees;
	}

	/**
	* Returns value of mMinutes
	* @return
	*/
	public int getMMinutes() {
		return mMinutes;
	}

	/**
	* Sets new value of mMinutes
	* @param
	*/
	public void setMMinutes(int mMinutes) {
		this.mMinutes = mMinutes;
	}

	/**
	* Returns value of mSeconds
	* @return
	*/
	public int getMSeconds() {
		return mSeconds;
	}

	/**
	* Sets new value of mSeconds
	* @param
	*/
	public void setMSeconds(int mSeconds) {
		this.mSeconds = mSeconds;
	}

	/**
	* Returns value of zDegrees
	* @return
	*/
	public int getZDegrees() {
		return zDegrees;
	}

	/**
	* Sets new value of zDegrees
	* @param
	*/
	public void setZDegrees(int zDegrees) {
		this.zDegrees = zDegrees;
	}

	/**
	* Returns value of zMinutes
	* @return
	*/
	public int getZMinutes() {
		return zMinutes;
	}

	/**
	* Sets new value of zMinutes
	* @param
	*/
	public void setZMinutes(int zMinutes) {
		this.zMinutes = zMinutes;
	}

	/**
	* Returns value of zSeconds
	* @return
	*/
	public int getZSeconds() {
		return zSeconds;
	}

	/**
	* Sets new value of zSeconds
	* @param
	*/
	public void setZSeconds(int zSeconds) {
		this.zSeconds = zSeconds;
	}

  private int howMuchWest(){
    int tempSeconds = (zDegrees * 60 * 60) + (zMinutes * 60) + zSeconds;
    if (eastWest == Zonal.EAST) {
      tempSeconds = tempSeconds * -1;
    }
    return tempSeconds;
  }
  private int howMuchSouth(){
    int tempSeconds = (mDegrees * 60 * 60) + (mMinutes * 60) + mSeconds;
    if (northSouth == Meridional.NORTH) {
      tempSeconds = tempSeconds * -1;
    }
    return tempSeconds;
  }
  public int compareTo(Coordinate arg0){
    int difference = howMuchWest() - arg0.howMuchWest();
    if (difference == 0) {
      difference = howMuchSouth() - arg0.howMuchSouth();
    }
    return difference;
  }
  public boolean equals(Object obj){
    boolean returnVal = false;
    if (obj instanceof Coordinate && compareTo((Coordinate)obj)==0) {
      returnVal = true;
    }
    return returnVal;
  }
}
