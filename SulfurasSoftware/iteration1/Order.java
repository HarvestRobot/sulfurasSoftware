public class Order {

	/**
	 * the table the order is carrying
	 */
	private Table table;
	/**
	 * The total bill of the order
	 */
	private double bill = 0.0;
	/**
	 * the array of first courses
	 */
	private Meal[] firstCourses;
	/**
	 * the second courses of the order
	 */
	private Meal[] secondCourses;
	/**
	 * the dessert of the order
	 */
	private Meal[] dessert;
	/**
	 * the beverages array for the order
	 */
	private Beverage[] beverages;

	public Table getTable() {
		return this.table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public double getBill() {
		return this.bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public Meal[] getFirstCourses() {
		return this.firstCourses;
	}

	public void setFirstCourses(Meal[] firstCourses) {
		this.firstCourses = firstCourses;
	}

	public Meal[] getSecondCourses() {
		return this.secondCourses;
	}

	public void setSecondCourses(Meal[] secondCourses) {
		this.secondCourses = secondCourses;
	}

	public Beverage[] getBeverages() {
		return this.beverages;
	}

	public void setBeverages(Beverage[] beverages) {
		this.beverages = beverages;
	}

}