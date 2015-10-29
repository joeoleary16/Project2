package domain;

import java.util.ArrayList;
import java.util.Date;
import java.io.File;;

public class Order {
	private String id;
	private Date creationDT;
	private boolean approved;
	private Date assessedDT;
	private Document document;
	private ArrayList<OrderItem> items;
	
	public Order(String staffID) {
		//TODO: generate random unique ID (based on time?)
		creationDT = new Date();
		approved = false;
		items = new ArrayList<OrderItem>();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreationDT() {
		return creationDT;
	}
	public void setCreationDT(Date creationDT) {
		this.creationDT = creationDT;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public Date getAssessedDT() {
		return assessedDT;
	}
	public void setAssessedDT(Date assessedDT) {
		this.assessedDT = assessedDT;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public ArrayList<OrderItem> getItems() {
		return items;
	}
	public void setItems(ArrayList<OrderItem> items) {
		this.items = items;
	}

	/**
	 * TODO: create javadoc for this method
	 * @param supplier
	 * @param catalogID
	 * @param name
	 * @param quantity
	 * @param price
	 * @param description
	 */
	public void addItem(Supplier supplier, String catalogID, String name, int quantity, double price, String description) {
		OrderItem oi = new OrderItem(supplier, catalogID, name, price, quantity, description);
		items.add(oi);
	}
	/**
	 * TODO: create javadoc for this method
	 * @param document
	 */
	public void setDocument(File document) {
		Document d = new Document(document);
		this.document = d;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", creationDT=" + creationDT + ", approved=" + approved + ", assessedDT="
				+ assessedDT + ", document=" + document + ", items=" + items + "]";
	}
}
