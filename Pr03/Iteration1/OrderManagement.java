public class OrderManagement {

	/**
	 * This method will create a new order when the clients arrive and sit on the table.
	 * @param table This is the table to create the order
	 */
	public Order newOrder(Table table) {

	}

	/**
	 * This will launch a notification to the kitchen with the new meals or beverages they need to prepare.
	 * @param type true = meals
	 * false = beverages
	 */
	public void newNotificationKitchen(boolean type) {
		// TODO - implement OrderManagement.newNotificationKitchen
		throw new UnsupportedOperationException();
	}

	/**
	 * This will launch a new notification for the waiter to come and retrieve any beverage or meal ready for any table.
	 * @param type true = meals
	 * false = beverages
	 */
	public void newNotificationWaiter(boolean type) {
		// TODO - implement OrderManagement.newNotificationWaiter
		throw new UnsupportedOperationException();
	}

	/**
	 * This will change the status of the table, depending on what are the commensals doing.
	 * @param table This is the table to be changed
	 */
	public void changeTableStatus(Table table) {
		// TODO - implement OrderManagement.changeTableStatus
		throw new UnsupportedOperationException();
	}

	/**
	 * This returns whether is stock avaiable or not to make the current order.
	 * @param order The current order
	 */
	public boolean ifStockAvaiable(Order order) {
		// TODO - implement OrderManagement.ifStockAvaiable
		throw new UnsupportedOperationException();
	}

	/**
	 * This will launch a notification saying that the current table of the order is ready to be approached by the waiter.
	 */
	public void notifyTableReady() {
		// TODO - implement OrderManagement.notifyTableReady
		throw new UnsupportedOperationException();
	}

	/**
	 * just in case they want more beverages.
	 * @param currentOrder the order
	 */
	public void modifyOrder(Order currentOrder) {
		// TODO - implement OrderManagement.modifyOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * this method will calculate the times to later generate statistics
	 */
	public void getTimes() {
		// TODO - implement OrderManagement.getTimes
		throw new UnsupportedOperationException();
	}

}