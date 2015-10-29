package domain;

import java.util.ArrayList;

public class Controller {
	public static final String VERSION = "1.0";
	private ArrayList<Order> newOrders;
	private ArrayList<Supplier> suppliers;
	
	public Controller() {
		newOrders = new ArrayList<>();
		suppliers = new ArrayList<>();
	}
	
	/**
	 * TODO: write javadoc
	 * @param supplierID
	 * @return
	 */
	public Supplier getSupplier(String supplierID) {
		for(Supplier supplier : suppliers) {
			if(supplier.getId().equals(supplierID)) {
				return supplier;
			}
		}
		return null;
	}
	
	/**
	 * TODO: write javadoc
	 * @param orderID
	 * @return
	 */
	public Order getOrder(String orderID) {
		for(Order order : newOrders) {
			if(order.getId().equals(orderID)) {
				return order;
			}
		}
		return null;
	}

}
