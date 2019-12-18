package com.vo;

public class OrderListVO {
	String order_id;
	String orderdetail_id;
	String product_name;
	String user_address;
	String user_name;
	int count;
	int totalprice;
	String order_stat;
	int product_id;
	
	@Override
	public String toString() {
		return "OrderListVO [order_id=" + order_id + ", orderdetail_id=" + orderdetail_id + ", product_name="
				+ product_name + ", user_address=" + user_address + ", user_name=" + user_name + ", count=" + count
				+ ", totalprice=" + totalprice + ", order_stat=" + order_stat + ", product_id=" + product_id + "]";
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public OrderListVO(String order_id, String orderdetail_id, String product_name, String user_address,
			String user_name, int count, int totalprice, String order_stat, int product_id) {
		super();
		this.order_id = order_id;
		this.orderdetail_id = orderdetail_id;
		this.product_name = product_name;
		this.user_address = user_address;
		this.user_name = user_name;
		this.count = count;
		this.totalprice = totalprice;
		this.order_stat = order_stat;
		this.product_id = product_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getOrderdetail_id() {
		return orderdetail_id;
	}
	public void setOrderdetail_id(String orderdetail_id) {
		this.orderdetail_id = orderdetail_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public String getOrder_stat() {
		return order_stat;
	}
	public void setOrder_stat(String order_stat) {
		this.order_stat = order_stat;
	}
	public OrderListVO(String order_id, String orderdetail_id, String product_name, String user_address,
			String user_name, int count, int totalprice, String order_stat) {
		super();
		this.order_id = order_id;
		this.orderdetail_id = orderdetail_id;
		this.product_name = product_name;
		this.user_address = user_address;
		this.user_name = user_name;
		this.count = count;
		this.totalprice = totalprice;
		this.order_stat = order_stat;
	}
	public OrderListVO() {
		super();
	}
	
	
}
