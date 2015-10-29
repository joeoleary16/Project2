package domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
	public static final String VERSION = "1.0";
	private HashMap<String, Order> orders;
	private ArrayList<Supplier> suppliers;
	
	public Controller() {
		orders = new HashMap<String, Order>();
		suppliers = new ArrayList<Supplier>();
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
		return null; //TODO: something important
		
	}
	
	/**
	 * TODO: write javadoc
	 * @param orderID
	 * @return
	 */
	public Order getOrder(String orderID) {
		return (orders.containsKey(orderID)) ? orders.get(orderID) : null;
	}

}
