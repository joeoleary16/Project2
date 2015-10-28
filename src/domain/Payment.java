package domain;

import java.util.Date;

public class Payment {
	private String id;
	private Date paidDT;
	private double amount; //TODO: consider using BigDecimal or Currency here as double is not recommended for currency 
	private PayrollStaff paidBy;
	
	public Payment(String id, Date paidDT, double amount, PayrollStaff paidBy) {
		this.id = id;
		this.paidDT = paidDT;
		this.amount = amount;
		this.paidBy = paidBy;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getPaidDT() {
		return paidDT;
	}
	public void setPaidDT(Date paidDT) {
		this.paidDT = paidDT;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public PayrollStaff getPaidBy() {
		return paidBy;
	}
	public void setPaidBy(PayrollStaff paidBy) {
		this.paidBy = paidBy;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", paidDT=" + paidDT + ", amount=" + amount + ", paidBy=" + paidBy + "]";
	}
	
}
