package com.vo;

public class OrderDetailVO {
	String orderdetail_id;
	String order_id;
	int product_id;
	int count;
	
	
	public OrderDetailVO(String order_id, int product_id, int count) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.count = count;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getOrderdetail_id() {
		return orderdetail_id;
	}
	public void setOrderdetail_id(String orderdetail_id) {
		this.orderdetail_id = orderdetail_id;
	}
	@Override
	public String toString() {
		return "OrderDetailVO [order_id=" + order_id + ", product_id=" + product_id + ", count=" + count
				+ ", orderdetail_id=" + orderdetail_id + "]";
	}
	public OrderDetailVO(String order_id, int product_id, int count, String orderdetail_id) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.count = count;
		this.orderdetail_id = orderdetail_id;
	}
	public OrderDetailVO() {
		super();
	}
	
	
}
