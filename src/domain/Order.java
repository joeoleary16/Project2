package domain;

import java.util.ArrayList;
import java.util.Date;
import java.io.File;;

public class Order {
	String id;
	Date creationDT;
	boolean approved = false;
	Date assessedDT;
	Document document;
	ArrayList<OrderItem> items;
	
	public Order(String staffID) {
		creationDT = new Date();
	}
	
	public void addItem(Supplier supplier, String catalogID, String name, int quantity, double price, String description) {
		OrderItem oi = new OrderItem(supplier, catalogID, name, price, quantity, description);
		items.add(oi);
	}
	
	public void setDocument(File document) {
		Document d = new Document(document);
		this.document = d;
	}
}
