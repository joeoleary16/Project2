package domain;

public class OrderItem {
	private Supplier supplier;
	private String catalogID;
	private String name;
	private String description;
	private double price;
	private int quantity;
	
	OrderItem(Supplier supplier, String catalogID, String name, double price, int quantity, String description) {
		this.supplier = supplier;
		this.catalogID = catalogID;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public String getCatalogID() {
		return catalogID;
	}
	public void setCatalogID(String catalogID) {
		this.catalogID = catalogID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItem [supplier=" + supplier + ", catalogID=" + catalogID + ", name=" + name + ", description="
				+ description + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
