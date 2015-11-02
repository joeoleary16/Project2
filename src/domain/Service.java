package domain;

import java.util.Date;

public class Service {
	private String id;
	private Date creationDT;
	private String name;
	private String description;
	private boolean draft;
	private double estTime;
	private Payment payment;
	private Location location;

	public Service(String id) {
		//TODO: generate random unique ID
		creationDT = new Date();
		this.id = id + '-' + creationDT.getTime();
		draft = true;
	}
	
	public Service(String id, String name, String description, double estTime) {
		super();
		creationDT = new Date();
		this.id = id + '-' + creationDT.getTime();
		this.name = name;
		this.description = description;
		this.estTime = estTime;
		draft = true;
	}

	/**
	 * TODO: write javadoc
	 * @param name
	 * @param description
	 * @param estTime
	 * @param location
	 * @return
	 */
	public boolean setServiceDetails(String name, String description, double estTime, Location location) {
		//TODO: implement validation here ?
		this.name = name;
		this.description = description;
		this.estTime = estTime;
		this.location = location;
		return true;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public double getEstTime() {
		return estTime;
	}
	public void setEstTime(double estTime) {
		this.estTime = estTime;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Date getCreationDT() {
		return creationDT;
	}
	public void setCreationDT(Date creationDT) {
		this.creationDT = creationDT;
	}
	public boolean isDraft() {
		return draft;
	}
	public void setDraft(boolean draft) {
		this.draft = draft;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", name=" + name + ", description=" + description + ", estTime=" + estTime
				+ ", payment=" + payment + ", location=" + location + "]";
	}
	
}
