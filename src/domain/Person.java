package domain;

public abstract class Person {
	private String id;
	private String password;
	private String name;
	private String address;
	private String phoneNo;
	
	public Person() {
	}
	
	public Person(String id, String password, String name, String address, String phoneNo) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + ", phoneNo="
				+ phoneNo + "]";
	}
}
