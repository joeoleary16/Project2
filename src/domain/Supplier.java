package domain;

public class Supplier {
	private String id;
	private String name;
	private String address;
	private String description;
	private String phoneNo;
	
	public Supplier(String id) {
		this.id = id;
	}

	public Supplier(String id, String name, String address, String description, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.description = description;
		this.phoneNo = phoneNo;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", address=" + address + ", description=" + description
				+ ", phoneNo=" + phoneNo + "]";
	}
}
