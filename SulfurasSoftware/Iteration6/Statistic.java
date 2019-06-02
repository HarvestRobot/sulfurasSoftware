public class Statistic {

	/**
	 * true = city
	 * false = restaurant
	 */
	private boolean range;
	/**
	 * 1: waiter
	 * 2: bartender
	 * 3: hall head
	 * 4: cooker
	 */
	private int type;

	public boolean isRange() {
		return this.range;
	}

	public int getType() {
		return this.type;
	}

}