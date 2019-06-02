/**
 * This is the object for a table.
 */
public class Table {

	/**
	 * The number of seats the table has (2, 4 or 6)
	 */
	public int nSeats;
	/**
	 * true = avaiable
	 * false = not avaiable
	 */
	public boolean avaiable;
	/**
	 * the identificator of the table
	 */
	public int tableID;
	/**
	 * the waiter that attends the table when the clients arrive
	 */
	public string waiter = null;

	public boolean isAvaiable() {
		return this.avaiable;
	}

	public void setAvaiable(boolean avaiable) {
		this.avaiable = avaiable;
	}

}