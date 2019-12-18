package com.vo;

import java.util.Date;

public class OrderVO {
	int order_id;
	String email;
	int totalprice;
	Date order_date;
	String address;
	String order_stat;
	
	public OrderVO(String email, int totalprice,  String address, String order_stat) {
		this.email = email;
		this.totalprice = totalprice;
		this.address = address;
		this.order_stat = order_stat;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrder_stat() {
		return order_stat;
	}
	public void setOrder_stat(String order_stat) {
		this.order_stat = order_stat;
	}
	@Override
	public String toString() {
		return "OrderVO [order_id=" + order_id + ", email=" + email + ", totalprice=" + totalprice + ", order_date="
				+ order_date + ", address=" + address + ", order_stat=" + order_stat + "]";
	}
	public OrderVO(int order_id, String email, int totalprice, Date order_date, String address, String order_stat) {
		this.order_id = order_id;
		this.email = email;
		this.totalprice = totalprice;
		this.order_date = order_date;
		this.address = address;
		this.order_stat = order_stat;
	}
	public OrderVO() {
	}
	
	
	
}
