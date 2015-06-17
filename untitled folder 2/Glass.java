package Class;

public class Glass {
	private String liquid;
	private int liquidAmount;
	private int liquidMaxAmount;
    
	/**
     * Default constructor...
     * @param liquidMaxAmount Maximum amount of liquid...
     */
	public Glass(int liquidMaxAmount) {
		this.liquid = null;
		this.liquidAmount = 0;
		this.liquidMaxAmount = liquidMaxAmount;
	}
	
	/**
	 * returns the type of liquid
	 * @return
	 */
	public String getTypeOfLiquid() {
		return liquid;
	}
	
	/**
	 * returns maximumcapacity of glass
	 * @return
	 */
	public int getMaxCapacity() {
		return liquidMaxAmount;
	}
	
    /**
     * returns current amount of liquid
     * @return
     */
	public int getCurrentCapacity() {
		return liquidAmount;
	}
	
	/**
	 * Method we use to add new amount of liquid to previous liquid.
	 * @param liquid
	 * @param amount
	 */
	public void addLiquid(String liquid, int amount) {
		if (this.liquid == null) {
			this.liquid = liquid;
			this.liquidAmount += amount;
			if (liquidAmount > liquidMaxAmount) {
				liquidAmount = liquidMaxAmount;
			}
		} else {
			if (liquid.equals(liquid) == true) {
				this.liquidAmount += amount;
				if (liquidAmount > liquidMaxAmount) {
					liquidAmount = liquidMaxAmount;
				}
			}
		}

	}

	public void emptyGlass() {
		this.liquidAmount = 0;
	}

}
