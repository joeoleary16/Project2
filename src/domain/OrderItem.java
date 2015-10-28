package domain;

public class OrderItem {
	Supplier supplier;
	String catalogID;
	String name;
	String description;
	double price;
	int quantity;
	
	OrderItem(Supplier supplier, String catalogID, String name, double price, int quantity, String description) {
		this.supplier = supplier;
		this.catalogID = catalogID;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
}
